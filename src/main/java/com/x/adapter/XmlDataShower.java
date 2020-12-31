package com.x.adapter;

import org.dom4j.Document;
import org.dom4j.Element;

import java.util.Iterator;

public class XmlDataShower implements DataShower {
    public void showData(Document document) {
        System.out.println(document);
        Element root = document.getRootElement();
        showElementData(root);
    }

    public void showElementData(Element e) {
        for (Iterator i = e.elementIterator(); i.hasNext();) {
            Element next = (Element) i.next();
            if(next.isTextOnly()) {
                System.out.println(next.getText());
            } else {
                showElementData(next);
            }
        }
    }
}
