package com.x.abstractfactory.factory.impl;

import com.x.abstractfactory.factory.ArmyFactory;
import com.x.abstractfactory.product.Archer;
import com.x.abstractfactory.product.Lancer;
import com.x.abstractfactory.product.Saber;
import com.x.abstractfactory.product.impl.OrcArcher;
import com.x.abstractfactory.product.impl.OrcLancer;
import com.x.abstractfactory.product.impl.OrcSaber;

public class OrcArmyFactory implements ArmyFactory {
    public Lancer createLancer() {
        return new OrcLancer();
    }

    public Saber createSaber() {
        return new OrcSaber();
    }

    public Archer createArcher() {
        return new OrcArcher();
    }
}
