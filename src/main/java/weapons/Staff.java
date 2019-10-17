package weapons;

import behaviors.IAttack;

public class Staff extends Weapon implements IAttack {

    public Staff(int damage) {
        super(damage);
    }

    public int attack() {
        return this.damage;
    }
}


