package characters;

import behaviors.IDefend;

public class Wizard extends Mage implements IDefend {

    public Wizard(String name, int healthPoints) {
        super(name, healthPoints);
    }
}

