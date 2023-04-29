public class Zombie extends Enemy {

    private int speed;

    public Zombie(int speed){
        super("Zombie", 10, 6);
        this.speed = speed;
    }
}
