import java.util.*;

public class Dog extends Enemy {

    public int support;
    public boolean helper = false;


    public Dog() {
        super("dog", 8, 4);
    }

    private void Friend() {
        Enemy dog = new Dog();
        support = (int) (java.lang.Math.random() * 10);
        if (support <= 5) {
            Isthreat = true;
            System.out.println("Run Away. Its not friendly");
        } else if(support > 5){
            System.out.println("Watch out. Its a dog");

        }

    }
    public void DogBark(){
        System.out.println("Bark! Bark! Bark!");
    }

    public void Attack(Dog dog) {
        int i = 5;
        while (i != 0) {
            Player.hp -= dog.damage;
            String[] DogScratch = {"\nYou got scratched and got hurt!"};
            System.out.print(DogScratch[(int) (java.lang.Math.random() * DogScratch.length)]);
            System.out.print("\nHealth: " + Player.hp);
            Player.attackEnemy(dog);
            i -= 1;
            if (dog.hp <= 2){
                Isthreat = false;
                i = 0;
                System.out.print("\nThe dog ran into a hole in the wall. \nGood riddance.");
            }
            if (dog.IsAlive() == true && dog.hp > 2 && i == 0){
                i += 1;
            }
            else if( dog.IsAlive() == false && i != 0){
                i = 0;
            }
        }
    }

    public void Dogfriend(){
        Enemy dog = new Dog();
        String[] DogFriend = {"\nThe canine sniffs your feet", "\nThe dog sits and stares patiently at you ", "\nIt seems it wants you to... pet it?",
                "\nThe canine wags its tail running around you ", "\n'Woof woof'! this dog REALLY wants to play"};
        System.out.print(DogFriend[(int) (java.lang.Math.random() * DogFriend.length)]);
        Isthreat = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nName this dog: ");
        String ourdog = sc.nextLine();
        dog.name = ourdog;
        System.out.printf("You named this dog: %s", dog.name);
    }
}