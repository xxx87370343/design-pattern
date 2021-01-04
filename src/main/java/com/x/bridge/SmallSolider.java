package com.x.bridge;

public class SmallSolider implements Soldier {
    public Weapon weapon;

    public SmallSolider(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        weapon.attack();
    }
}
