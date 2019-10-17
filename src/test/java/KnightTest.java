import characters.Barbarian;
import characters.Knight;
import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Sword sword;


    @Before
    public void before(){
        sword = new Sword(20);
        knight = new Knight("Bob", 70, sword);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", knight.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(70, knight.getHealthPoints());
    }

    @Test
    public void hasSword(){
        Sword sword = (Sword) knight.getWeapon();
        assertEquals(20, sword.getDamage());
    }

    @Test
    public void canAttackWithSword(){
        assertEquals(90, knight.attack());
    }

    @Test
    public void canAttackWithAxe(){
        Axe axe = new Axe(10);
        knight = new Knight("Bob", 65, axe);
        assertEquals(75, knight.attack());
    }

    @Test
    public void knightCanChangeWeapon(){
        Axe axe = new Axe(15);
        knight.changeWeapon(axe);
        assertEquals(85, knight.attack());
    }

}
