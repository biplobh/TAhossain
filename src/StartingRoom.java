import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class  StartingRoom extends MapTile {

    public StartingRoom(int x, int y) {
        super(x, y);
    }

    public String introduction() {
        final String[] Intro = {"Time Stop! you are in nowhere. Something does not feel right.", "You look around, you see no one",
                "You try to figure out whats going on. But you do not know whats going on because its your first time to being here ", "You see the wall surrounding you is thick and so wet that mosh started to growing "};
        return Intro[new Random().nextInt(Intro.length)];
    }

    @Override
    public void playerInfo(Player player) throws IOException {
        int i =  (int) (Math.random() * 10);
        if (i == 3 || i == 6){
            Dog dog = new Dog();
        }
        if(i == 2 || i == 4){
            System.out.print("The floor is muddy");
        }
        if(i == 5 || i == 7 || i == 8 || i == 9){
            System.out.print("Something is moving in the corner \n Would you like to see check it? yes/no (y/n): ");
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            char response_input = in.readLine().charAt(0);
            if (response_input == 'y') {
                int rInput = new Random().nextInt(5);
                if (rInput == 1) {
                    System.out.print("You got a map");
                    Player.inventory.add(new Map());
                }
                else if (rInput == 2){System.out.print("its a dead zombie creature in the floor");
                    if (((int) (Math.random() * 3)) % 2 == 0) {
                        System.out.print("\nDam! you inhale some poison from that zombie creature");
                        Player.hp -= 5;
                        System.out.print("\nYour health: " + Player.hp);
                    }
                }
                else if (rInput == 3){
                    System.out.print("you found some gold");
                    Player.inventory.add(new Gold(((int) (Math.random() * 50))));}

                else if (rInput == 4) {System.out.print("Shoot... \nYou just woke up a sleeping dog.");
                    Dog dog = new Dog();
                    dog.damage = (int) (Math.random() * 10);
                    if (dog.damage <= 5) {
                        dog.Isthreat = true;
                        dog.Attack(dog);
                        dog.DogBark();
                        System.out.println("Crazy dog... Run! ");
                    } else if(dog.damage > 5){
                        System.out.println("Watch out its a dog. ");

                    }
                }
            }
        }
    }
}