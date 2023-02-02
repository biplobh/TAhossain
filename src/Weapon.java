public class Weapon extends Item {
    private int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Weapon(String name, String description, int value, int damage) {
        super(name, description, value);
        this.damage = damage;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nDescription: %s\nValue: %d\nDamage: %d",
                this.name, this.desc, this.value, this.damage);
    }
}
