package com.x.abstractfactory.product.impl;

import com.x.abstractfactory.product.Saber;

public class OrcSaber implements Saber {
    private final String description = "兽人族， 用剑的";

    public String getDescription() {
        return description;
    }
}
