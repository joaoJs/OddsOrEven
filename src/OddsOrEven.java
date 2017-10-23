//import java.util.Scanner;
import java.util.*;
public class OddsOrEven {
    public static void main(String[] args) {
        Greeting();
    }

    public static void Greeting() {
        System.out.println("Let’s play a game called \"Odds and Evens\"");
        System.out.print("What is your name? ");
        Scanner nameInp = new Scanner(System.in);
        String name = nameInp.next();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
        Scanner userInp = new Scanner(System.in);
        String user = userInp.next();
        String computer = "";
        if (user.equals("O")) {
            computer = "E";
            System.out.println("User has picked odds. The computer will be evens.");
        } else {
            System.out.println("User has picked evens. The computer will be odds.");
            computer = "O";
        }
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println();

        System.out.print("How many fingers do you put? ");
        Scanner fingersInp = new Scanner(System.in);
        int userNumber = fingersInp.nextInt();

        //computer gets a random number
        Random rand = new Random();
        int computerNumber = rand.nextInt(6);

        System.out.println("The computer plays " + computerNumber + " fingers.");
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println();

        int sum = userNumber + computerNumber;
        System.out.println("The total sum is " + sum);

        if (sum % 2 == 0) {
            System.out.println("The sum is even.");
            if (user.equals("E")) {
                System.out.println("User won.");
            } else {
                System.out.println("Computer won.");
            }
        } else {
            System.out.println("The sum is odd.");
            if (user.equals("O")) {
                System.out.println("User won.");
            } else {
                System.out.println("Computer won.");
            }
        }
        for (int i = 0; i < 40; i++) {
            System.out.print("-");

        }
        System.out.println();
    }
}
