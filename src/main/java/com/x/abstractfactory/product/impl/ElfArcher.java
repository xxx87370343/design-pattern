package com.x.abstractfactory.product.impl;

import com.x.abstractfactory.product.Archer;

public class ElfArcher implements Archer {
    private final String description = "精灵族， 射箭的";

    public String getDescription() {
        return description;
    }
}
