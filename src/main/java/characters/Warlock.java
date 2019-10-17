package characters;

import behaviors.IDefend;

public class Warlock extends Mage implements IDefend {
    public Warlock(String name, int healthPoints) {
        super(name, healthPoints);
    }
}
