package weapons;

import behaviors.IAttack;

public class Club extends Weapon implements IAttack {

    public Club (int damage) {
        super(damage);
    }

    public int attack() {
        return this.damage;
    }
}
