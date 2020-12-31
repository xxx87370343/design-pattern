package com.x.adapter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.dom4j.Document;
import org.dom4j.Element;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JsonDataShowerAdapter implements DataShower {
    public JsonDataShower jsonDataShower = new JsonDataShower();
    public void showData(Document document) {
        Map map = documentToMap(document);
        JSONObject jsonObject = mapToJsonObject(map);
        jsonDataShower.showData(jsonObject);
    }

    public Map documentToMap(Document document) {
        Element root = document.getRootElement();
        Map<Object, Object> map = putElementDataToMap(root);
        return map;
    }

    public Map putElementDataToMap(Element e) {
        Map<Object, Object> map = new HashMap<Object, Object>();
        for (Iterator i = e.elementIterator(); i.hasNext();) {
            Element next = (Element) i.next();
            if(next.isTextOnly()) {
                map.put(next.getName(), next.getText());
            } else {
                ArrayList list = putElementDataToList(next);
                map.put(next.getName(), list);
            }
        }
        return map;
    }

    public ArrayList putElementDataToList(Element e) {
        ArrayList list = new ArrayList();
        for (Iterator i = e.elementIterator(); i.hasNext();) {
            Element next = (Element) i.next();
            Map map = putElementDataToMap(next);
            list.add(map);
        }
        return list;
    }

    public JSONObject mapToJsonObject(Map map) {

        return (JSONObject)JSON.toJSON((Object) map);
    }
}
