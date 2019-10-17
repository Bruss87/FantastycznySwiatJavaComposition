import characters.Barbarian;
import characters.Dwarve;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarveTest {

    Dwarve dwarve;

    @Before
    public void before(){
        dwarve = new Dwarve("David", 60);
    }

    @Test
    public void hasName(){
        assertEquals("David", dwarve.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(60, dwarve.getHealthPoints());
    }
}
