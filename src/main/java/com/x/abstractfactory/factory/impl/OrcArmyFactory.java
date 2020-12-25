package com.x.abstractfactory.factory.impl;

import com.x.abstractfactory.factory.ArmyFactory;
import com.x.abstractfactory.product.Archer;
import com.x.abstractfactory.product.Lancer;
import com.x.abstractfactory.product.Saber;
import com.x.abstractfactory.product.impl.OrcArcher;
import com.x.abstractfactory.product.impl.OrcLancer;
import com.x.abstractfactory.product.impl.OrcSaber;

public class OrcArmyFactory implements ArmyFactory {
    private OrcLancerFactory orcLancerFactory = new OrcLancerFactory();
    private OrcSaberFactory orcSaberFactory = new OrcSaberFactory();
    private OrcArcherFactory orcArcherFactory = new OrcArcherFactory();

    public Lancer createLancer() {
        return orcLancerFactory.getSoldier();
    }

    public Saber createSaber() {
        return orcSaberFactory.getSoldier();
    }

    public Archer createArcher() {
        return orcArcherFactory.getSoldier();
    }
}
