package game;

import java.util.*;

public class Elf extends Character {
    private int dmg;
    private int heal;

    public Elf() {
        this.hitPoint = 180;
        this.dmg = 35;
        this.heal = 30;
        this.maxHP = 180;
        this.species = "Elf";
    }

    public void attack(Character c) {
        if (!isDie()) {
            Random rnd = new Random();
            rnd.setSeed(System.currentTimeMillis());
            int random = rnd.nextInt(100);
            if (random < 30) {
                dmg = 70;
            } else {
                dmg = 35;
            }
            System.out.print(species + " attacks with damage " + dmg + ".");
            c.hitPoint = c.getDamage(dmg);
        }
    }

    public void recover() {
        Random rnd = new Random();
        rnd.setSeed(System.currentTimeMillis());
        int random = rnd.nextInt(100);
        if (random < 30) {
            heal = 50;
        } else {
            heal = 30;
        }
        hitPoint += heal;
        portionNumber -= 1;
        System.out.println(species + " took portion of " + heal + ", " + portionNumber + " portion(s) and " + hitPoint
                + " hit point left.");
    }
}
