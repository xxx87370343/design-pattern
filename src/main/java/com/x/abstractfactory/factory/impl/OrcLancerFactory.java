package com.x.abstractfactory.factory.impl;

import com.x.abstractfactory.factory.LancerFactory;
import com.x.abstractfactory.product.Lancer;
import com.x.abstractfactory.product.impl.OrcLancer;

public class OrcLancerFactory implements LancerFactory {
    public Lancer getSoldier() {
        return new OrcLancer();
    }
}
