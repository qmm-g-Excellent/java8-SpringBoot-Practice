package com;

/**
 * Created by qmm on 17-7-27.
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args){
        try{
            //声明一个文件输入流file，并指明该文件在系统中的路径以方便定位
            FileInputStream file = new FileInputStream("/home/qmm/internship-TW/readfile.txt");
            int data = 0;//声明一个整型变量用于存放读取的数据

            //因为文件是GBK编码，而文件类型为ANSI，所以输出的是文件按内容各个字符的ASCII编码，10则代表了换行符。
            while((data = file.read())!= -1){
                //在while循环中使用read()方法持续读取file，数据赋到data中
                //如果读取失败或者结束，则将返回-1，这个特殊的返回值可以作为读取结束的标识
                System.out.println(data);
            }
            file.close();//文件读取结束之后一定要通过close()方法关闭这个流对象
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
