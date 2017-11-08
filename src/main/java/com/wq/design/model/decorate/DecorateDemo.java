package com.wq.design.model.decorate;

import com.wq.design.model.decorate.details.GreenTea;
import com.wq.design.model.decorate.seasoning.Cup;
import com.wq.design.model.decorate.seasoning.MilkShake;
import com.wq.design.model.decorate.seasoning.Sugar;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

/**
 * @author: Paul
 * @time:2017/11/4 0:40
 * @description:
 */
public class DecorateDemo {

    public static void main(String args[]) throws IOException {

        Drink tea = new GreenTea("西湖龙井",Drink.GRANDE);
        tea = new Cup(tea);//先把饮料装进杯子
        tea = new MilkShake(tea);//一份奶昔
        tea = new Sugar(tea);//一份糖
        System.out.println("开始计算购买该饮品的单价");
        BigDecimal bigDecimal = new BigDecimal(tea.cost());
        bigDecimal = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println("总价-->"+bigDecimal.doubleValue());

        System.out.println("======================开始测试自定义的文件流解析器【使用装饰者模式】======================");
        InputStream inputStream = new LowerCharInputStream(
                new BufferedInputStream(new FileInputStream("src/main/resources/Demo.txt")));
        //以下两种方式都一样
//        int c;
//        while((c = inputStream.read())>= 0){
//            System.out.print((char) c);
//        }
        byte[] buffer = new byte[1024];
        while(inputStream.read(buffer,0,buffer.length) >= 0){
            System.out.print(new String(buffer,"UTF-8"));
        }
        inputStream.close();
    }
}
