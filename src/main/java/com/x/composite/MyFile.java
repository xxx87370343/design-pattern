package com.x.composite;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class MyFile implements Target {
    File file = null;

    public MyFile(String path) {
        file = new File(path);
    }

    public void print() {
        BufferedInputStream in = null;
        byte[] bytes = new byte[2048];
        int n = -1;
        try {
            in = new BufferedInputStream(new FileInputStream(file));
            while ((n = in.read(bytes, 0, bytes.length)) != -1) {
                String str = new String(bytes, 0, n, "UTF-8");
                System.out.println(file.getName() + ":" + str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void add(Target target) {
        throw new IllegalArgumentException("不支持该方法");
    }

    public void remove(Target target) {
        throw new IllegalArgumentException("不支持该方法");
    }
}
