package com.x.abstractfactory.product.impl;

import com.x.abstractfactory.product.Saber;

public class ElfSaber implements Saber {
    private final String description = "精灵族， 用剑的";

    public String getDescription() {
        return description;
    }
}
