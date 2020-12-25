package com.x.abstractfactory.product.impl;

import com.x.abstractfactory.product.Lancer;

public class OrcLancer implements Lancer {
    private final String description = "兽人族， 用枪的";

    public String getDescription() {
        return description;
    }
}
