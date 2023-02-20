public class Enemy {
    protected String name;
    protected int hp;
    protected int damage;

    public Enemy(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public Enemy() {

    }

    public boolean isAlive() {
        return (this.hp > 0);
    }
    public String toString() {
        return String.format("%s\nDescription: %s\nValue: %d", this.name, this.hp, this.damage);
    }
}
