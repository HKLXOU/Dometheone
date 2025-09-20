package org.example;

import java.io.FileOutputStream;
import java.io.IOException;

public class Fileoutputdome1 {

    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("A.txt", true);
        byte[] bytes = {98,97,96,97};
        outputStream.write(97);
        outputStream.write(98);
        outputStream.write(bytes);
        outputStream.write("nihao".getBytes());
        outputStream.close();

    }
}
