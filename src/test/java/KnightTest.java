import characters.Barbarian;
import characters.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Bob", 70);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", knight.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(70, knight.getHealthPoints());
    }
}
