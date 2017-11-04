package com.wq.design.model.decorate;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author: Paul
 * @time:2017/11/4 1:06
 * @description:将读取到的字符串中，大写的转换为小写
 */
public class LowerCharInputStream extends FilterInputStream {

    //调用父类的构造方法
    protected LowerCharInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException{
        int code = super.read();
        if(code == -1){
            return -1;
        }else{
            return Character.toLowerCase((char) code);
        }
    }

    public int read(byte b[], int off, int len) throws IOException {
        int result = super.read(b,off,len);
//        System.out.println(result);
        for(int i = off;i<off+result;i++){
            b[i] = (byte) Character.toLowerCase((char)b[i]);
        }
        return result;
    }

}
