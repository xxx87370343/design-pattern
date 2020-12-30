package com.x.builder;

public class App {
    public static void main(String[] args) {
        Soldier s1 = new Soldier.SoldierBuilder("x士兵").withWeapon(Weapon.SWORD).get();
        System.out.println(s1);
        Soldier s2 = new Soldier.SoldierDirector().archer();
        System.out.println(s2);
    }
}
