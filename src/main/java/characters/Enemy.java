package characters;

import behaviors.IAttack;
import weapons.Weapon;

public abstract class Enemy extends Weapon implements IAttack {

    int healthPoints;


    public Enemy( int healthPoints) {
        this.healthPoints = healthPoints;
    }
    public int getHealthPoints(){
        return this.healthPoints;
    }

    public int takeDamage(){
        return this.healthPoints - 20;
    }
}

