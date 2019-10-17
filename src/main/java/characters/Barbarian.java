package characters;

import behaviors.IAttack;

public class Barbarian extends Fighter implements IAttack {

   public Barbarian(String name, int healthPoints) {
       super(name, healthPoints);
   }


    public int attack() {
        return 0;
    }
}
