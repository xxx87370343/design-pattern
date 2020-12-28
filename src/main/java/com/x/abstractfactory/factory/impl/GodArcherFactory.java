package com.x.abstractfactory.factory.impl;

import com.x.abstractfactory.factory.ArcherFactory;
import com.x.abstractfactory.product.Archer;
import com.x.abstractfactory.product.impl.GodArcher;

public class GodArcherFactory implements ArcherFactory {
    public Archer getSoldier() {
        return new GodArcher();
    }
}
