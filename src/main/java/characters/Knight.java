package characters;

import behaviors.IWeapon;

public class Knight extends Player implements IWeapon {
    public  Knight (String name, int healthPoints){
        super(name, healthPoints);

    }

    public int attack() {
    }
}