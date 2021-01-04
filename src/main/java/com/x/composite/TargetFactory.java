package com.x.composite;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class TargetFactory {
    public static Target getTarget(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            return new MyFolder(file.getPath());
        }
        return new MyFile(file.getPath());
    }
}
