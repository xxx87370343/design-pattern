package com.x.abstractfactory;

import com.x.abstractfactory.factory.ArmyFactory;
import com.x.abstractfactory.factory.impl.ElfArmyFactory;
import com.x.abstractfactory.factory.impl.FactoryMaker;
import com.x.abstractfactory.factory.impl.GodArmyFactory;
import com.x.abstractfactory.factory.impl.OrcArmyFactory;
import com.x.abstractfactory.product.Archer;
import com.x.abstractfactory.product.Lancer;
import com.x.abstractfactory.product.Saber;

public class App {
    public static void main(String[] args) {
        ArmyFactory orcArmyFactory = new OrcArmyFactory();
        outPutArmy(orcArmyFactory);

        System.out.println("====================================");

        ArmyFactory elfArmyFactory = new ElfArmyFactory();
        outPutArmy(elfArmyFactory);

        System.out.println("====================================");

        ArmyFactory godArmyFactory = new GodArmyFactory();
        outPutArmy(godArmyFactory);

        System.out.println("====================================");

        ArmyFactory godArmyFactory2 = FactoryMaker.getArmyFactory(FactoryMaker.FactoryType.GOD);
        outPutArmy(godArmyFactory2);
    }

    private static void outPutArmy(ArmyFactory armyFactory) {
        Lancer lancer = armyFactory.createLancer();
        Saber saber = armyFactory.createSaber();
        Archer archer = armyFactory.createArcher();
        System.out.println(lancer.getDescription());
        System.out.println(saber.getDescription());
        System.out.println(archer.getDescription());
    }
}
