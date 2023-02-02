public class Main {
    public static void main(String[] args) {

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
    }
}