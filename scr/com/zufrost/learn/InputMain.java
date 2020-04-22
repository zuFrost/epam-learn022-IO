package com.zufrost.learn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class InputMain {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("data/info.txt");
            int code = inputStream.read();
            System.out.println(code + " char = " + (char)code);
            byte[] ar = new byte[16];
            int num =  inputStream.read(ar);
            System.out.println("num = " + num);
            System.out.println(Arrays.toString(ar));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
