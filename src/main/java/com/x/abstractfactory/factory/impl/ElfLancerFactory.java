package com.x.abstractfactory.factory.impl;

import com.x.abstractfactory.factory.LancerFactory;
import com.x.abstractfactory.product.Lancer;
import com.x.abstractfactory.product.impl.ElfLancer;

public class ElfLancerFactory implements LancerFactory {
    public Lancer getSoldier() {
        return new ElfLancer();
    }
}
