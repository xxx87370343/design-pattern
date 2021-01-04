package com.x.composite;

import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MyFolder implements Target {
    File file = null;
    List<Target> targetList = new ArrayList<>();

    public MyFolder(String path) {
        file = new File(path);
        File[] childFiles = file.listFiles();
        for (File childFile : childFiles) {
            targetList.add(TargetFactory.getTarget(childFile.getPath()));
        }
    }

    public void print() {
        System.out.println(file.getName());
        targetList.forEach(Target::print);
    }

    public void add(Target target) {
        targetList.add(target);
    }

    public void remove(Target target) {
        targetList.remove(target);
    }
}
