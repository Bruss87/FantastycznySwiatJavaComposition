import characters.Barbarian;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Sword sword;

    @Before
    public void before(){
        sword = new Sword(20);
        barbarian = new Barbarian("Borris", 75, sword );
    }

    @Test
    public void hasName(){
        assertEquals("Borris", barbarian.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(75, barbarian.getHealthPoints());
    }

    @Test
    public void hasSword(){
        Sword sword = (Sword) barbarian.getWeapon();
        assertEquals(20, sword.getDamage());
    }

    @Test
    public void canAttackWithSword(){
        assertEquals(95, barbarian.attack());
    }

    @Test
    public void canAttackWithAxe(){
        Axe axe = new Axe(10);
        barbarian = new Barbarian("Bob", 60, axe);
        assertEquals(70, barbarian.attack());
    }

    @Test
    public void dwarfCanChangeWeapon(){
        Axe axe = new Axe(15);
        barbarian.changeWeapon(axe);
        assertEquals(90, barbarian.attack());
    }

}
