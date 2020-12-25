package com.x.abstractfactory.factory.impl;

import com.x.abstractfactory.factory.ArmyFactory;
import com.x.abstractfactory.product.Archer;
import com.x.abstractfactory.product.Lancer;
import com.x.abstractfactory.product.Saber;

public class ElfArmyFactory implements ArmyFactory {
    private ElfLancerFactory elfLancerFactory = new ElfLancerFactory();
    private ElfSaberFactory elfSaberFactory = new ElfSaberFactory();
    private ElfArcherFactory elfArcherFactory = new ElfArcherFactory();

    public Lancer createLancer() {
        return elfLancerFactory.getSoldier();
    }

    public Saber createSaber() {
        return elfSaberFactory.getSoldier();
    }

    public Archer createArcher() {
        return elfArcherFactory.getSoldier();
    }
}
