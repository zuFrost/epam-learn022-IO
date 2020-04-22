package com.zufrost.learn;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


class IOMain {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("data/input.txt"); OutputStream os = new FileOutputStream("data/output.txt")) {
            int bytesReaded;
            final int BUFFER_SIZE = 10_000;
            byte[] buff = new byte[BUFFER_SIZE];
            while ((bytesReaded = is.read(buff)) != -1) {
                os.write(buff, 0, bytesReaded);
            }
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
    }
}