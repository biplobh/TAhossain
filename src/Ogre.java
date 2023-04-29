public class Ogre extends Enemy{

    public Ogre() {
        super("Ogre", 10, 6);
    }
    public static void OgreCombat(Enemy ogre){
        ogre.damage = (int) (java.lang.Math.random() * 10);
        int reruns = 5;
        while(reruns!= 0){
            Player.hp -= ogre.damage;
            String[] OgreAttack = {"\nThe ogre has giant body! ", "\nOger punches in the floor!",
                    "\n The ogre start to rore! ", "\n You srart to bleed ", "\ndrop drop!"};
            int randy_OgreAttack = (int) (java.lang.Math.random() * OgreAttack.length);
            System.out.print(OgreAttack[randy_OgreAttack]);
            if(OgreAttack[randy_OgreAttack] == OgreAttack[3]){
                Player.hp -= (int) (java.lang.Math.random() * 5);
            }
            System.out.print("\nYour health is now" + ' ' + Player.hp);
            Player.attackEnemy(ogre);
            reruns -= 1;
            if(!ogre.IsAlive()){
                reruns = 0;
            }
        }
    }
    public static void scremingOger(){
        System.out.println( "Sound like Ogre");
    }
}

