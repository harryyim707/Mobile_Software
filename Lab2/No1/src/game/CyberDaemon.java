package game;

import java.util.*;

public class CyberDaemon extends Character {
    private int dmg;
    private int heal;

    public CyberDaemon() {
        this.hitPoint = 250;
        this.dmg = 40;
        this.heal = 30;
        this.maxHP = 250;
        this.species = "CyberDaemon";
    }

    public void attack(Character c) {
        if(!isDie()){
            Random rnd = new Random();
            rnd.setSeed(System.currentTimeMillis());
            int random = rnd.nextInt(100);
            if (random < 30) {
                dmg = 60;
            } else {
                dmg = 40;
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
