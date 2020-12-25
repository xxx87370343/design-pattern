package com.x.abstractfactory;

import com.x.abstractfactory.factory.ArmyFactory;
import com.x.abstractfactory.factory.impl.ElfArmyFactory;
import com.x.abstractfactory.factory.impl.GodArmyFactory;
import com.x.abstractfactory.factory.impl.OrcArmyFactory;
import com.x.abstractfactory.product.Archer;
import com.x.abstractfactory.product.Lancer;
import com.x.abstractfactory.product.Saber;

public class App {
    public static void main(String[] args) {
        ArmyFactory orcArmyFactory = new OrcArmyFactory();
        Lancer orcLancer = orcArmyFactory.createLancer();
        Saber orcSaber = orcArmyFactory.createSaber();
        Archer orcArcher = orcArmyFactory.createArcher();
        System.out.println(orcLancer.getDescription());
        System.out.println(orcSaber.getDescription());
        System.out.println(orcArcher.getDescription());

        System.out.println("====================================");

        ArmyFactory elfArmyFactory = new ElfArmyFactory();
        Lancer elfLancer = elfArmyFactory.createLancer();
        Saber elfSaber = elfArmyFactory.createSaber();
        Archer elfArcher = elfArmyFactory.createArcher();
        System.out.println(elfLancer.getDescription());
        System.out.println(elfSaber.getDescription());
        System.out.println(elfArcher.getDescription());

        System.out.println("====================================");

        ArmyFactory godArmyFactory = new GodArmyFactory();
        Lancer godLancer = godArmyFactory.createLancer();
        Saber godSaber = godArmyFactory.createSaber();
        Archer godArcher = godArmyFactory.createArcher();
        System.out.println(godLancer.getDescription());
        System.out.println(godSaber.getDescription());
        System.out.println(godArcher.getDescription());
    }
}
