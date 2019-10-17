package weapons;

import behaviors.IAttack;

public class Sword extends Weapon implements IAttack {

    public Sword(int damage){
        super (damage);
    }

    public int attack() {
      return this.damage;
    }
}
