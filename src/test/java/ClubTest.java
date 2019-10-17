import org.junit.Before;
import org.junit.Test;
import weapons.Club;

import static org.junit.Assert.assertEquals;

public class ClubTest {

    Club club;

    @Before
    public void before(){
        club = new Club(5);
    }

    @Test
    public void hasDamage(){
        assertEquals(5, club.getDamage());
    }

    @Test
    public void canAttack(){
        assertEquals(5, club.attack());
    }
}
