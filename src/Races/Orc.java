package Races;

public class Orc extends PrimalBeing implements Spy{

    public Orc(String name){
        super(name);

        this.attackpower = 20;
        this.health = 90;
        this.defense = 5;
    }



    @Override
    public void attackFirst(PrimalBeing toAttack) {
        this.attack(toAttack);
    }
}
