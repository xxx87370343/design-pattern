package com.x.bridge;

public class BigSolider implements Soldier {
    public Weapon weapon;

    public BigSolider(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        weapon.attack();
    }
}
