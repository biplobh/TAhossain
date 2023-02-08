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

        Bee biplob = new Bee();
         System.out.println(biplob);
        biplob.setAttack("Bee King");
        System.out.println("Attacker name is: " + biplob.getAttack());


    }
}