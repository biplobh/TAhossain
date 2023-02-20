import java.lang.reflect.Method;

public class Action {
    // Class Variables
    private Method method;
    private char hotkey;
   // private String name;
    //private Enemy kwargs;

    public char getHotkey() {return hotkey;}
    private String name;
    public void setHotkey(char hotkey) {
        this.hotkey = hotkey;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name; }
    private Enemy kwargs;
    public Enemy getKwargs() {return kwargs; }

    public void setKwargs(Enemy kwargs) {this.kwargs = kwargs; }

    // Constructor method
    public Action(Method method, String name, char hotkey, Enemy kwargs) {
        // Instance variables
        this.method = method;
        this.hotkey = hotkey;
        this.name = name;
        this.kwargs = kwargs;
    }

    // Will return
    public String str() {
        return hotkey + " " + name;
    }
}
