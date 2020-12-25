package com.x.abstractfactory.factory.impl;

import com.x.abstractfactory.factory.ArcherFactory;
import com.x.abstractfactory.product.Archer;
import com.x.abstractfactory.product.impl.OrcArcher;

public class OrcArcherFactory implements ArcherFactory {
    public Archer getSoldier() {
        return new OrcArcher();
    }
}
