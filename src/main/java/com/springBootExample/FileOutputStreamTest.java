package com.springBootExample;

/**
 * Created by qmm on 17-7-27.
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String args[]){
        try {
            //新建文件的路径
            String path = "/home/qmm/internship-TW/writeFile.txt";
            String content = "Hello qmm";
            FileOutputStream file = new FileOutputStream(path);

            //将内容写入文件
            file.write(content.getBytes());
            file.close();
            System.out.println("File created successfully.");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
