package com.x.decorator;

import java.io.IOException;
import java.io.InputStream;

public class FileDataSource implements DataSource {
    private String path = null;

    public FileDataSource(String path) {
        this.path = path;
    }

    @Override
    public String read() {
        try (InputStream is = App.class.getClassLoader().getResourceAsStream("file_1.txt")) {
            byte[] bytes = new byte[1024];
            int len = 0;
            StringBuilder sb = new StringBuilder();
            while((len = is.read(bytes)) != -1) {
                sb.append(new String(bytes, 0, len));
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public void write() {

    }
}
