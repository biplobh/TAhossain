public class GoblinCave extends EnemyRoom{

    public GoblinCave(int x, int y, Enemy enemy) {
        super(x, y, enemy);
    }
    private String[] Goblins = {"Be Patient, Do not get Distracted, Or something ugly and dangerous might pop out",
            "You choose the path life or death . Goblin is out there",
            "They hide in the shadow to struck you.",
            "They consider as the lowlife who wants to take down humanity"};

    public String intro_text(){

        return Goblins[(int) (java.lang.Math.random() * Goblins.length)];
    }
}
