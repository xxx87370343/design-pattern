package com.x.abstractfactory.factory.impl;

import com.x.abstractfactory.factory.ArmyFactory;
import com.x.abstractfactory.product.Archer;
import com.x.abstractfactory.product.Lancer;
import com.x.abstractfactory.product.Saber;
import com.x.abstractfactory.product.impl.GodArcher;
import com.x.abstractfactory.product.impl.GodLancer;
import com.x.abstractfactory.product.impl.GodSaber;

public class GodArmyFactory implements ArmyFactory {
    private GodLancerFactory godLancerFactory = new GodLancerFactory();
    private GodSaberFactory godSaberFactory = new GodSaberFactory();
    private GodArcherFactory godArcherFactory = new GodArcherFactory();

    public Lancer createLancer() {
        return godLancerFactory.getSoldier();
    }

    public Saber createSaber() {
        return godSaberFactory.getSoldier();
    }

    public Archer createArcher() {
        return godArcherFactory.getSoldier();
    }
}
