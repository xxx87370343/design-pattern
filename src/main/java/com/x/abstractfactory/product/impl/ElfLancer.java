package com.x.abstractfactory.product.impl;

import com.x.abstractfactory.product.Lancer;

public class ElfLancer implements Lancer {
    private final String description = "精灵族， 用枪的";

    public String getDescription() {
        return description;
    }
}
