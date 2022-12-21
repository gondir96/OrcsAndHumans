package Races;

public class PrimalBeing {

    protected int health;
    protected int attackpower;
    protected int defense;

    protected String name;


    PrimalBeing(String name){
        this.name = name;
    }


    public void attack(PrimalBeing toAttack){
        if ((toAttack.getDefense() - this.attackpower) < 0){
            toAttack.setHealth(toAttack.getHealth() + (toAttack.getDefense() - this.attackpower));
        }

        System.out.println(toAttack.name + " has " + toAttack.getHealth() + " health");
    }
    

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        if (health < 0){
            this.health = 0;
        }
        else {
            this.health = health;
        }

    }

    public int getDefense() {
        return this.defense;
    }

    public void stat(){
        System.out.println(this.name +
                " health: " + this.health +
                " attackp: " + this.attackpower +
                " defense: " + this.defense);
    }
}
