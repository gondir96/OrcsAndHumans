import Races.Human;
import Races.Orc;
import Races.PrimalBeing;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Our job to create a mini-game.
        // PART 1
        //There are orcs and humans. They are in a war. *surprised pikachu face*
        //Each of them have an attack power, a defense point, and a health point.
        //If neither of the opponents is a spy, or both of them are, the first attack is decided randomly.
        /*An attack looks something like this:
            defender.health = attacker.attackpower - defender.defense */
        //A human has 15 defense point, but only 10 attackpower.
        //An orc has 5 defense only, but 20 attackpower.
        //Both of them have 90 healthpoint.
        //Attacker role changes every round.

        //Part 2
        //There is a role: Spy.
        //Both races can be Spies.
        //A Spy has the opportunity to attack first.


        Orc orc = new Orc("orc");
        Human human = new Human("human");

        orc.stat();
        human.stat();

        fight(human, orc);

    }

    public static void fight(Human human, Orc orc){

        orc.attackFirst(human);

        PrimalBeing firstAttacker;
        PrimalBeing secondAttacker;


        int random = new Random().nextInt(101);

        if (random % 2 == 0){
            firstAttacker = human;
            secondAttacker = orc;
        } else {
            firstAttacker = orc;
            secondAttacker = human;
        }

        int counter = 1;
        while (orc.getHealth() > 0 && human.getHealth() > 0){
            System.out.println(counter + ". round");
            firstAttacker.attack(secondAttacker);
            if (secondAttacker.getHealth() <= 0){
                break;
            }
            secondAttacker.attack(firstAttacker);
            counter++;
        }
    }
}















