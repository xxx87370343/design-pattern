package com.x.abstractfactory.factory;

import com.x.abstractfactory.product.Archer;
import com.x.abstractfactory.product.Lancer;
import com.x.abstractfactory.product.Saber;

/*
 抽象工厂 ：用来生产不同产品族的全部产品
 增加新产品时，需要修改工厂
 增加产品族时，需要增加工厂
 符合单一职责原则，部分符合开放-封闭原则）
 */
public interface ArmyFactory {
    public Lancer createLancer();
    public Saber createSaber();
    public Archer createArcher();
}
