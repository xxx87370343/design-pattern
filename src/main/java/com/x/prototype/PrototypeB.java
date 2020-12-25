package com.x.prototype;

public class PrototypeB implements Prototype {

    private String id = "B";
    private int number = 2;
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
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
}
