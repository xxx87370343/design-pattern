package com.x.abstractfactory.product.impl;

import com.x.abstractfactory.product.Saber;

public class GodSaber implements Saber {
    private final String description = "神族， 用剑的";

    public String getDescription() {
        return description;
    }
}
