package com.x.abstractfactory.factory.impl;

import com.x.abstractfactory.factory.ArmyFactory;
import com.x.abstractfactory.product.Archer;
import com.x.abstractfactory.product.Lancer;
import com.x.abstractfactory.product.Saber;
import com.x.abstractfactory.product.impl.ElfArcher;
import com.x.abstractfactory.product.impl.ElfLancer;
import com.x.abstractfactory.product.impl.ElfSaber;

public class ElfArmyFactory implements ArmyFactory {
    public Lancer createLancer() {
        return new ElfLancer();
    }

    public Saber createSaber() {
        return new ElfSaber();
    }

    public Archer createArcher() {
        return new ElfArcher();
    }
}
