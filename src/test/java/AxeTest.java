import org.junit.Before;
import org.junit.Test;
import weapons.Axe;

import static org.junit.Assert.assertEquals;

public class AxeTest {
    Axe axe;

    @Before
    public void before(){
        axe = new Axe(10);
    }

    @Test
    public void hasDamage(){
        assertEquals(10, axe.getDamage());
    }

    @Test
    public void canAttack(){
        assertEquals(10, axe.attack());
    }

}
