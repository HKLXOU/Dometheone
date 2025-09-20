package org.example;

import java.io.FileInputStream;
import java.io.IOException;

public class Fileinputdome1 {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("A.txt");
        int read1 = inputStream.read();
        while (inputStream.read() != -1) {
            System.out.println(inputStream.read());
        }

    }
}
