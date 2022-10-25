package game;

import java.util.*;

public abstract class Character {
    int hitPoint;
    int portionNumber;
    int maxHP;
    String species;

    public Character() {
        initialize();
    }

    void initialize() {
        this.portionNumber = 5;
        this.hitPoint = maxHP;
    }

    public abstract void attack(Character c);

    int getDamage(int damage) {
        hitPoint -= damage;
        if(!isDie()){
            System.out.println(species+" has "+hitPoint+" hit point now.");
            if(species.equals("Barlog")){
                if(needPortion())recover();
                if(needPortion())recover();
            }
            else{
                if(needPortion())recover();
            }
        }
        else{
            hitPoint=0;
        }
        return hitPoint;
    }

    public abstract void recover();

    public boolean isDie() {
        if (hitPoint <= 0) {
            System.out.println(species+" is dead.");
            return true;
        } else {
            return false;
        }
    }

    boolean needPortion() {
        if (portionNumber != 0 && hitPoint < maxHP) {
            System.out.print("Do you want to take a portion? [y/n]");
            Scanner in = new Scanner(System.in);
            String x = in.nextLine();
            if (x.equals("y")) {
                return true;
            } else {
                return false;
            }
        } else {
            if (portionNumber == 0) {
                System.out.println("No Portion Left!");
            }
            return false;
        }
    }

    void whoAmI(){
        System.out.println("This is a(n) "+species+" Character.");
    }

}
