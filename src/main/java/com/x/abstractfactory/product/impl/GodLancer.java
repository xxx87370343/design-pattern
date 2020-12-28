package com.x.abstractfactory.product.impl;

import com.x.abstractfactory.product.Lancer;

public class GodLancer implements Lancer {
    private final String description = "神族， 用枪的";

    public String getDescription() {
        return description;
    }
}
