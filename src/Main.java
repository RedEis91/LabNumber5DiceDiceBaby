import java.util.Random;
import java.util.Scanner;



public class Main {
    public static void main (String[] args) {
        System.out.println("Hey big baller, welcome to the casino!");
        Random randGen = new Random();  // New random number generator
        Scanner scan = new Scanner(System.in);
        int sides = 1;
        String cont = "yes";
        do {
            diceDiceBaby(sides, scan, randGen, cont);
        } while (cont.contains("y") || cont.contains("Y"));
        return;
    }

    public static void diceDiceBaby (int sides, Scanner scan, Random randGen, String cont) {
        System.out.println("How many sides do you ");
        sides = scan.nextInt();
        System.out.println(sides + " sided dice rolling...");

        // randGen.nextInt(6) yields 0, 1, 2, 3, 4, or 5
        // so + 1 makes that 1, 2, 3, 4, 5, or 6
        System.out.println(randGen.nextInt((sides)) + 1);
        System.out.println(randGen.nextInt((sides)) + 1);
        System.out.println("Roll again?");
        cont = scan.nextLine();

    }
}