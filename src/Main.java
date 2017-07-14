import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main (String[] args) {
        System.out.println("Hey big baller, welcome to the world series of dice!");
        Scanner scan = new Scanner(System.in);
        int sides = 1;
        int roll = 1;
        boolean contin;
        String cont = " ";
        System.out.println("How many sides on your pair o' bones?");
        sides = scan.nextInt();
        //clearing enter from scanner
        scan.nextLine();
        int sides2 = sides;
        do {
            contin = diceDiceBaby(sides, sides2, scan, cont, roll);

        } while (contin);
    }
    public static boolean diceDiceBaby (int sides, int sides2, Scanner scan, String cont, int roll) {
        Random randGen = new Random();  // New random number generator
        System.out.println("A pair of " + sides + " sided dice rolling...");
        System.out.println("...rolling...");
        System.out.println("...rolling...");
        // randGen.nextInt(6) yields 0, 1, 2, 3, 4, or 5
        // so + 1 makes that 1, 2, 3, 4, 5, or 6
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Roll " + roll + ":");
        System.out.println(randGen.nextInt((sides)) + 1);
        System.out.println(randGen.nextInt((sides2)) + 1);
        if ((randGen.nextInt((sides)) + 1) == 1 && (randGen.nextInt((sides2)) + 1) == 1)
        {
            System.out.println("Snake eyes!");
        }
        System.out.print("Roll again? (y/n)");
        System.out.println(cont);
        cont = scan.nextLine();
        System.out.println(cont);
        if (cont.contains("y") || cont.contains("Y"))
        {
            System.out.println("Let's go!");
            System.out.println(" ");
            return true;
        } else
            {
                System.out.println("Thanks for playing!");
                return false;
            }
    }
}