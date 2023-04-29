public class Enemy {
    protected String name;
    protected int hp;
    protected int damage;

    public Enemy(String name, int hp, int damage){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public String getName() {return name;}
    public boolean IsAlive(){
        return(this.hp > 0);
    }
    public static boolean Isthreat = false;

    public String toString() {
        return String.format("%s Damage: %s \nHealth: %d \n", this.name, this.damage, this.hp);
    }
}
