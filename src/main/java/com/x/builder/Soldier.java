package com.x.builder;

public class Soldier {
    private final String name;
    private final Weapon weapon;
    private final Armor armor;

    public Soldier(SoldierBuilder builder) {
        this.name = builder.name;
        this.weapon = builder.weapon;
        this.armor = builder.armor;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon +
                ", armor=" + armor +
                '}';
    }

    public static class SoldierBuilder {
        private final String name;
        private Weapon weapon;
        private Armor armor;

        public SoldierBuilder(String name) {
            this.name = name;
        }

        public SoldierBuilder withWeapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public SoldierBuilder withArmor(Armor armor) {
            this.armor = armor;
            return this;
        }

        public Soldier get() {
            return new Soldier(this);
        }
    }

    public static class SoldierDirector {
        public Soldier archer() {
            return new Soldier.SoldierBuilder("x弓兵").withWeapon(Weapon.ARCH).withArmor(Armor.IRON).get();
        }
    }
}
