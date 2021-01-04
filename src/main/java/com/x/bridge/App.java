package com.x.bridge;
/*
* 桥接模式： 将抽象与实现解耦，以便可以单独进行修改
* 例： 当需要不同的兵种，如（枪兵，弓兵等），采取士兵+武器的组合方式
* 士兵的攻击方式委托于武器进行，士兵对于武器属于抽象，武器实现了士兵的攻击方式
*
* 类图与策略模式一致，需要区分二者模式的意图
* */
public class App {
    public static void main(String[] args) {
        new BigSolider(new Bow()).attack();
        new SmallSolider(new Sword()).attack();
    }
}
