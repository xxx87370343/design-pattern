package com.x.abstractfactory.factory.impl;

import com.x.abstractfactory.factory.ArmyFactory;

public class FactoryMaker {

    public enum FactoryType {
        ELF, ORC, GOD
    }

    public static ArmyFactory getArmyFactory(FactoryType type) {
        switch (type) {
            case ELF:
                return new ElfArmyFactory();
            case ORC:
                return new OrcArmyFactory();
            case GOD:
                return new GodArmyFactory();
            default:
                throw new IllegalArgumentException("FactoryType not supported.");
        }
    }
}
