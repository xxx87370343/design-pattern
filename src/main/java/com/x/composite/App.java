package com.x.composite;

import java.net.URL;

public class App {
    public static void main(String[] args) {
        URL url = App.class.getClassLoader().getResource("folder_1");
        Target target = TargetFactory.getTarget(url.getPath());
        target.print();

        System.out.println("===========================");

        URL url2 = App.class.getClassLoader().getResource("file_1.txt");
        target.add(TargetFactory.getTarget(url2.getPath()));
        target.print();

        System.out.println("===========================");

        URL url3 = App.class.getClassLoader().getResource("folder_3");
        target.add(TargetFactory.getTarget(url3.getPath()));
        target.print();
    }
}
