package weapons;

public abstract class Weapon {
    int damage;

    public Weapon(int damage){
        this.damage = damage;
    }

    public int getDamage(){
        return this.damage;
    }
}
