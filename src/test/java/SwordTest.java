import org.junit.Before;
import org.junit.Test;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;

    @Before
    public void before(){
        sword = new Sword(20);
    }

    @Test
    public void hasDamage(){
        assertEquals(20, sword.getDamage());
    }

    @Test
    public void canAttack(){
        assertEquals(20, sword.attack());
    }
}
