package com.zufrost.learn;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutMain {
    public static void main(String[] args) {
        try {
            FileOutputStream outputStream = new FileOutputStream("data/out.txt", true);
            outputStream.write(48);
            byte[] value = {65, 67, 100};
            outputStream.write(value);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
    }
}
