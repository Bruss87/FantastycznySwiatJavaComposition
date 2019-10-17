import org.junit.Before;
import org.junit.Test;
import weapons.Staff;

import static org.junit.Assert.assertEquals;

public class StaffTest {

    Staff staff;

    @Before
    public void before(){
        staff = new Staff(50);
    }

    @Test
    public void hasDamage(){
        assertEquals(50, staff.getDamage());
    }

    @Test
    public void canAttack(){
        assertEquals(50, staff.attack());
    }
}
