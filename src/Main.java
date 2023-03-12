//import java.lang.reflect.Method;
import java.util.*;
import java.io.*;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
/*
        //Item
        Item i1 = new Item("Item name", "Item desc",  10);
        Item i2 = new Item("Item name2", "Item desc2", 11);
       // System.out.println(i1);

        //Gold
        Gold goldBar = new Gold("White goldbar", 10);
        Gold goldBar1 = new Gold("Golden goldbar", 10);
       // System.out.println(goldBar);

        //Weapon
        Weapon magicSword = new Weapon("Magic Sword",
                "A sharp blade for cutting", 10, 20);
       // System.out.println(magicSword);

      //Sword
        Sword s1 = new Sword();
       // System.out.println(s1);

        //Pillow
        Pillow p1 = new Pillow();
        //System.out.println(p1);

        //Mace
        Mace bigMace = new Mace();
        //System.out.println(bigMace);

        //Arrow
        Arrow arrow1 = new Arrow();
        //System.out.println(arrow1);
 //Enemy
        Enemy enemy = new Enemy("Biplob", 500, 50);
        //System.out.println("Enemy name: " + enemy.name  +"\n"+"Enemy HP: " + enemy.hp+"\n"+ "Enemy damage: " + enemy.damage);
       // System.out.println("Is enemy alive: " + enemy.isAlive());
//Ogre
        Ogre  greenOgre = new Ogre ();
        Ogre  redOgre = new Ogre ();
        //System.out.println(redOgre);
//Zombie
        Zombie  slowZombie = new Zombie ();
        Zombie  fastZombie = new Zombie ();
        //System.out.println(fastZombie);
//Dog
        Dog spotDog = new Dog ();
       // System.out.println(spotDog);
//GiantSpider
        GiantSpider  g= new GiantSpider   ();
        //System.out.println(g);
//Bee (My self)
/*
        Bee biplob = new Bee();
         System.out.println(biplob);
        biplob.setAttack("Bee King");
        System.out.println("Attacker name is: " + biplob.getAttack());
*/
/*
//Action
        // Create an instance of the Action class
        Method method = null; // Replace with actual method
        char hotkey = 'x';
        String name = "Enymy Attacker";
        Enemy kwargs = null; // Replace with actual enemy
        Action action = new Action(method, name, hotkey, kwargs);

        // Print out the hotkey and name of the action
        System.out.println("Hotkey: " + action.getHotkey());
        System.out.println("Name: " + action.getName());

 */
/*
        //Method
        Method method = Method.MoveWest;

        if (method == Method.Flee) {
            System.out.println("Fleeing act");
        } else if (method == Method.Attack) {
            System.out.println("Attacking enemy");
        } else if (method == Method.Viewlnventory) {
            System.out.println("Viewing inventory");
        } else if (method == Method.MoveEast) {
            System.out.println("Moving east");
        } else if (method == Method.MoveWest) {
            System.out.println("Moving west");
        } else if (method == Method.MoveSouth) {
            System.out.println("Moving south");
        } else if (method == Method.MoveNorth) {
            System.out.println("Moving north");
        } else {
            System.out.println("Unexpected Input");
        }

*/
/*
//MoveNorth
        MoveNorth moveNorthAction = new MoveNorth();

        System.out.println("Action Name: " + moveNorthAction.getName());
        System.out.println("Hotkey: " + moveNorthAction.getHotkey());
        System.out.println("Keyword Arguments: " + moveNorthAction.getKwargs());
 */
        /*
        //MoveEast
        MoveEast moveEastAction = new MoveEast();

        System.out.println("Action Name: " + moveEastAction.getName());
        System.out.println("Hotkey: " + moveEastAction.getHotkey());
        System.out.println("Keyword Arguments: " + moveEastAction.getKwargs());
         */
        /*
        //Viewlnventory
        Viewlnventory viewInventoryAction = new Viewlnventory();

        System.out.println("Action Name: " + viewInventoryAction.getName());
        System.out.println("Hotkey: " + viewInventoryAction.getHotkey());
        System.out.println("Keyword Arguments: " + viewInventoryAction.getKwargs());

         */
        //Flee
        /*
        Flee fleeAction = new Flee();

        System.out.println("Action Name: " + fleeAction.getName());
        System.out.println("Hotkey: " + fleeAction.getHotkey());
        System.out.println("Keyword Arguments: " + fleeAction.getKwargs());

         */
        /*
        //MoveSouth
        MoveSouth MoveSouthAction = new MoveSouth();

        System.out.println("Action Name: " + MoveSouthAction.getName());
        System.out.println("Hotkey: " + MoveSouthAction.getHotkey());
        System.out.println("Keyword Arguments: " + MoveSouthAction.getKwargs());

         */
        /*
        //MoveWest
        MoveWest MoveWestAction = new MoveWest();

        System.out.println("Action Name: " + MoveWestAction.getName());
        System.out.println("Hotkey: " + MoveWestAction.getHotkey());
        System.out.println("Keyword Arguments: " + MoveWestAction.getKwargs());

         */
        /*
        //Center
        Center CenterAction = new Center();

        System.out.println("Action Name: " + CenterAction.getName());
        System.out.println("Hotkey: " + CenterAction.getHotkey());
        System.out.println("Keyword Arguments: " + CenterAction.getKwargs());
*/

        //World
        //MapTile

        // Read the map file into an ArrayList

        ArrayList<String> map = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader
                    ("src/map.txt"));
            String line;
            while ((line = reader.readLine()) != null) // Read each line of the file and add it to the ArrayList
            {
                map.add(line);
            }
            reader.close();
        } catch (Exception e)  // Catch any exceptions if something error
        {
            e.printStackTrace();
            System.out.println("File does not exist");
        }

        // Print property from map
        for (String line : map) {
            System.out.println(line);
        }

    }
}
