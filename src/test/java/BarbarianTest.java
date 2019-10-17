import characters.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Borris", 75);
    }

    @Test
    public void hasName(){
        assertEquals("Borris", barbarian.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(75, barbarian.getHealthPoints());
    }

}
