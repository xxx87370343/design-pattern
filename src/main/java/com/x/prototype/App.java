package com.x.prototype;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeA prototypeA = PrototypeA.prototypeA;
        System.out.println("原对象：" + prototypeA);
        System.out.println("id: " + prototypeA.getId());
        System.out.println("number: " + prototypeA.getNumber());
        System.out.println("prototypeB: " + prototypeA.getPrototypeB());
        System.out.println("prototypeC: " + prototypeA.getPrototypeC());
        System.out.println("================================================");
        PrototypeA prototypeA1 = (PrototypeA) prototypeA.clone();
        System.out.println("克隆对象：" + prototypeA1);
        System.out.println("id: " + prototypeA1.getId());
        System.out.println("number: " + prototypeA1.getNumber());
        System.out.println("prototypeB: " + prototypeA1.getPrototypeB());
        System.out.println("prototypeC: " + prototypeA1.getPrototypeC());
        System.out.println("================================================");
        // false clone在内从中开辟空间
        System.out.println("prototypeA == prototypeA1: " + (prototypeA == prototypeA1));
        // true 常量直接复制（基本数据类型），比较值
        System.out.println("prototypeA.id == prototypeA1.id: " + (prototypeA.getId() == prototypeA1.getId()));
        // true String为final，引用同一个，但修改的同时会生成新的String对象
        System.out.println("prototypeA.number == prototypeA1.number: " + (prototypeA.getNumber() == prototypeA1.getNumber()));
        // true 浅拷贝，引用类型指向同一个对象
        System.out.println("prototypeA.prototypeB == prototypeA1.prototypeB: " + (prototypeA.getPrototypeB() == prototypeA1.getPrototypeB()));
        // false 深拷贝，在prototypeA拷贝时，调用在prototypeC的拷贝
        System.out.println("prototypeA.prototypeC == prototypeA1.prototypeC: " + (prototypeA.getPrototypeC() == prototypeA1.getPrototypeC()));
    }
}
