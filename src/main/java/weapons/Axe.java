package weapons;

import behaviors.IAttack;

public class Axe extends Weapon implements IAttack {

    public Axe(int damage) {
        super(damage);
    }

    public int attack() {
        return this.damage;
    }
}
