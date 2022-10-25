package game;

import java.util.*;

public class Barlog extends Character {
    private int dmg;
    private int heal;

    public Barlog() {
        this.hitPoint = 170;
        this.dmg = 25;
        this.heal = 30;
        this.maxHP = 170;
        this.species = "Barlog";
    }

    public void attack(Character c) {
        if(!isDie()){
            for (int i = 0; i < 2; i++) {
                Random rnd = new Random();
                rnd.setSeed(System.currentTimeMillis());
                int random = rnd.nextInt(100);
                if (random < 20) {
                    dmg = 35;
                } else {
                    dmg = 25;
                }
                System.out.print(species + " attacks with damage " + dmg + ".");
                c.hitPoint = c.getDamage(dmg);
            }
        }
    }

    public void recover() {
        hitPoint += heal;
        portionNumber -= 1;
        System.out.println(species + " took portion of " + heal + ", " + portionNumber + " portion(s) and " + hitPoint
                + " hit point left.");
    }
}
