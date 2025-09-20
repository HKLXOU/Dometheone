package com.lxq.dome;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Filedome {
    public static void main(String[] args) throws IOException {
        //创建 file 类
        File file = new File("A.txt");
        file.createNewFile();
        long l = file.lastModified();
        System.out.println(new Date(l));
        String path = file.getAbsolutePath();
        System.out.println(path);
    }
}
