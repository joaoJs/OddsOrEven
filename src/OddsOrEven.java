import java.util.Scanner;
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
    }
}
