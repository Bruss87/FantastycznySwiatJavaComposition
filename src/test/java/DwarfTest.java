import characters.Dwarf;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Sword sword;

    @Before
    public void before(){
        sword = new Sword(20);
        dwarf = new Dwarf("David", 60, sword);
    }

    @Test
    public void hasName(){
        assertEquals("David", dwarf.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(60, dwarf.getHealthPoints());
    }

    @Test
    public void hasSword(){
        Sword sword = (Sword) dwarf.getWeapon();
        assertEquals(20, sword.getDamage());
    }

    @Test
    public void canAttackWithSword(){
        assertEquals(80, dwarf.attack());
    }

    @Test
    public void canAttackWithAxe(){
        Axe axe = new Axe(10);
        dwarf = new Dwarf("Bob", 65, axe);
        assertEquals(75, dwarf.attack());
    }

    @Test
    public void dwarfCanChangeWeapon(){
        Axe axe = new Axe(15);
        dwarf.changeWeapon(axe);
        assertEquals(75, dwarf.attack());
    }

}
