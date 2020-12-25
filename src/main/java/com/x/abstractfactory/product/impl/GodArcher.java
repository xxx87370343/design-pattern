package com.x.abstractfactory.product.impl;

import com.x.abstractfactory.product.Archer;

public class GodArcher implements Archer {
    private final String description = "神族， 射箭的";

    public String getDescription() {
        return description;
    }
}
