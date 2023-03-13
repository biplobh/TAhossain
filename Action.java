import java.lang.reflect.Method;

public class Action {
    // Class Variables
    private Method method;
    private char hotkey;
   private String name;
    private Enemy kwargs;


    // New action variables
    private int damage;
    private int range;

    public char getHotkey() {return hotkey;}
    //private String name;
    public void setHotkey(char hotkey) {
        this.hotkey = hotkey;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name; }
    //private Enemy kwargs;
    public Enemy getKwargs() {return kwargs; }

    public void setKwargs(Enemy kwargs) {this.kwargs = kwargs; }

    //New action
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }


    // Constructor method
    public Action(Method method, String name, char hotkey, Enemy kwargs, int damage, int range) {
        // Instance variables
        this.method = method;
        this.hotkey = hotkey;
        this.name = name;
        this.kwargs = kwargs;
        this.damage = damage;
        this.range = range;

    }

    // Will return
    public String str() {
        return hotkey + " " + name;
    }
}
