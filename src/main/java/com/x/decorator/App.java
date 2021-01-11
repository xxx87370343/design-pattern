package com.x.decorator;

public class App {
    public static void main(String[] args) {
        String path = "file_1.txt";
        FileDataSource fileDataSource = new FileDataSource(path);
        String res = fileDataSource.read();
        System.out.println(res);
        EncryptedDataSource encodeDataSource = new EncryptedDataSource(fileDataSource);
        String res2 = encodeDataSource.read();
        System.out.println(res2);
    }
}
