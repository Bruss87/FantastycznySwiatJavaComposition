package characters;

import behaviors.IAttack;

public class Dwarve extends Fighter implements IAttack {

    public Dwarve(String name, int healthPoints){
        super(name, healthPoints);
    }


    public int attack() {
        return 0;
    }
}
