package game;

public class Human extends Character {
    private int dmg;
    private int heal;

    public Human() {
        this.hitPoint = 200;
        this.dmg = 50;
        this.heal = 40;
        this.maxHP = 200;
        this.species = "Human";
    }

    public void attack(Character c) {
        if (!isDie()) {
            System.out.print(species + " attacks with damage " + dmg + ".");
            c.hitPoint = c.getDamage(dmg);
        }
    }

    public void recover() {
        hitPoint += heal;
        portionNumber -= 1;
        System.out.println(species + " took portion of " + heal + ", " + portionNumber + " portion(s) and " + hitPoint
                + " hit point left.");
    }
}
