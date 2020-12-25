package com.x.prototype;

public class PrototypeA implements Prototype {
    public static PrototypeA prototypeA = new PrototypeA(new PrototypeB(), new PrototypeC());

    private String id = "A";
    private int number = 1;
    private PrototypeB prototypeB = null;
    private PrototypeC prototypeC = null;

    private PrototypeA(PrototypeB prototypeB, PrototypeC prototypeC) {
        this.prototypeB = prototypeB;
        this.prototypeC = prototypeC;
    }

    public Prototype clone() throws CloneNotSupportedException {
        PrototypeA prototypeA = (PrototypeA) super.clone();
        prototypeA.prototypeC = (PrototypeC) this.prototypeC.clone();
        return prototypeA;
    }

    public PrototypeC getPrototypeC() {
        return prototypeC;
    }

    public void setPrototypeC(PrototypeC prototypeC) {
        this.prototypeC = prototypeC;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public PrototypeB getPrototypeB() {
        return prototypeB;
    }

    public void setPrototypeB(PrototypeB prototypeB) {
        this.prototypeB = prototypeB;
    }
}
