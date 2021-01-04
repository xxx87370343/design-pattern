package com.x.composite;

public interface Target {
    public void print();

    public void add(Target target);
    public void remove(Target target);

}
