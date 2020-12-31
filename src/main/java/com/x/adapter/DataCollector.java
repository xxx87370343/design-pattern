package com.x.adapter;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.net.URL;

public class DataCollector {
    DataShower dataShower;

    public DataCollector(DataShower dataShower) {
        this.dataShower = dataShower;
    }

    public Document getData() {
        URL url = this.getClass().getClassLoader().getResource("adapter-test.xml");
        SAXReader reader = SAXReader.createDefault();
        Document document = null;
        try {
            document = reader.read(url);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return document;
    }

    public void showData() {
        Document document = getData();
        dataShower.showData(document);
    }
}
