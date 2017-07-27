package com.springBootExample;

/**
 * Created by qmm on 17-7-27.
 */

import java.io.*;

public class BufferedReaderAndBufferedWriter {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/home/qmm/internship-TW/readfile.txt");
        FileWriter fw = new FileWriter("/home/qmm/internship-TW/FileWriterTest.txt");

        BufferedReader bufr = new BufferedReader(fr);
        BufferedWriter bufw = new BufferedWriter(fw);

        //一行一行的读取，并写入。
        String line = null;
        while ((line = bufr.readLine()) != null)

        {
            bufw.write(line);
            bufw.newLine();

            //使用缓冲区中的方法，将数据刷新到目的地文件中去。
            bufw.flush();
        }

    /*  一個字節一個字節的寫。
        int ch = 0;
        while((ch = bufr.read())!=-1){
            bufw.write(ch);
        }*/

        //关闭缓冲区,同时关闭了bufw，　bufr流对象
        bufr.close();
        bufw.close();
    }
}
