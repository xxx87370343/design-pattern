package com.x.adapter;

import com.alibaba.fastjson.JSONObject;

public class JsonDataShower {

    public void showData(JSONObject jsonObject) {
        System.out.println("JSONObject: ");
        System.out.println(jsonObject);
        System.out.println("======================");
        System.out.println("Map: ");
        System.out.println(jsonObject.getInnerMap());
        System.out.println("======================");
        System.out.println("JSONString: ");
        System.out.println(jsonObject.toJSONString());
        System.out.println("======================");
    }
}
