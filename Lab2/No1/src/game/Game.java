package game;

import java.util.Random;

public class Game {
    static Character battle(Character blue, Character red){
        Character win;
        System.out.println(blue.species+" vs "+red.species);
        while(true){
            if(red.isDie() || blue.isDie()){
                break;
            }
            blue.attack(red);
            red.attack(blue);
        }
        win = (red.hitPoint > blue.hitPoint)? red: blue;
        System.out.println("The winner between "+blue.species+" and "+red.species+" is "+win.species);
        win.initialize();
        return win;
    }

    static void tournament(Character hu, Character cyber, Character bar, Character el){
        //semi-finals
        Random r = new Random();
        r.setSeed(System.currentTimeMillis());
        int[] blue = new int[4];
        Character[] semi = {hu, cyber, bar, el};
        for(int i = 0; i<4; i++){
            blue[i]=r.nextInt(4);
            for(int j=0;j<i;j++){
                if(blue[i]==blue[j]) i--;
            }
        }
        Character winner = battle(battle(semi[blue[0]],semi[blue[1]]), battle(semi[blue[2]], semi[blue[3]]));
        winner.whoAmI();
    }

    public static void main(String[] args) throws Exception {
        Character human = new Human();
        Character cyberDaemon = new CyberDaemon();
        Character barlog = new Barlog();
        Character elf = new Elf();
        tournament(human, cyberDaemon, barlog, elf);   
    }
}
