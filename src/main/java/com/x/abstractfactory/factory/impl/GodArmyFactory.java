package com.x.abstractfactory.factory.impl;

import com.x.abstractfactory.factory.ArmyFactory;
import com.x.abstractfactory.product.Lancer;
import com.x.abstractfactory.product.Saber;
import com.x.abstractfactory.product.impl.GodLancer;
import com.x.abstractfactory.product.impl.GodSaber;

public class GodArmyFactory implements ArmyFactory {
    public Lancer createLancer() {
        return new GodLancer();
    }

    public Saber createSaber() {
        return new GodSaber();
    }
}
