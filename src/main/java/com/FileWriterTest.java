package com;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
//    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
    public static void main(String args[]){
        try {
            //新建文件的路径
            String path = "/home/qmm/internship-TW/FileWriter.txt";
            String content = "Hello qmm FileWriter test!";
            FileWriter file = new FileWriter(path);

            //将内容写入文件
            file.write(content);
            file.close();
            System.out.println("File created successfully.");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
