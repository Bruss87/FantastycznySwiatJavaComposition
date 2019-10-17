package characters;

import behaviors.IAttack;

public abstract class Fighter extends Player implements IAttack {

    public Fighter(String name, int healthPoints) {
        super(name, healthPoints);
    }
}
