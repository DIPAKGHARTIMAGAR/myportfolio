import java.util.Scanner;

public class Quiz1 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Welcome to quiz game!");
        System.out.println("Would you like to start the game?");
        System.out.println("Type Yes or No");

        String input = scn.nextLine();

        if (input.equals("No")) {
            return;
        }

        System.out.println("What is your name?");
        String nm = scn.nextLine();

        System.out.println(nm + ", Do I have a girlfriend?");
        String m = scn.nextLine();

        if (!m.equals("yes")) {
            System.out.println("You are wrong! I have a girlfriend");
            return;
        }else {

        System.out.println("Nice! Guess my girlfriend's name:");
        System.out.println("aayushma, aashma, aashima, ayushma");
        
        boolean win = false;

        for (int i = 1; i <= 3; i++) {
                              
            String guess = scn.nextLine();
            System.out.println("Attempt " + i);
            if (guess.equals("aayushma")) {
                System.out.println("Nice! You win!");
                win = true;
                break;
            } else {
                System.out.println("Wrong guess!");
            }
        }

        if (!win) {
            System.out.println("Game Over!");
        }

        scn.close();
    }
}
}