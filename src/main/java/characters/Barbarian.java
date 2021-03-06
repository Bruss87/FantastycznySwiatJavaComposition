package characters;

import behaviors.IAttack;

public class Barbarian extends Fighter implements IAttack {

    IAttack weapon;

    public Barbarian(String name, int healthPoints, IAttack weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }


    public IAttack getWeapon(){
        return this.weapon;
    }

    public int attack() {
        return this.healthPoints += this.weapon.attack();
    }

    public void changeWeapon(IAttack newWeapon){
        this.weapon = newWeapon;
    }

}
