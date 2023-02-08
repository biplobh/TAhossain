public class Bee extends Enemy {
    private String attack;

    public Bee() {
        super("The Bee", 8, 5);
        this.attack = "";
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }
}

