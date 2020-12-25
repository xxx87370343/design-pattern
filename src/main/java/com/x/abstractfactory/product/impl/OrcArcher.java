package com.x.abstractfactory.product.impl;

import com.x.abstractfactory.product.Archer;

public class OrcArcher implements Archer {
    private final String description = "兽人族， 射箭的";

    public String getDescription() {
        return description;
    }
}
