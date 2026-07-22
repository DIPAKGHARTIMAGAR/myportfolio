package example;
import java.util.Random;
import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in=new Scanner(System.in);
		Random ran=new Random();
		
		int guessnum=ran.nextInt(20)+1;
		int guess=0;
		int attempts=0;
		
		System.out.println("Welcome to the number guessing game");
		System.out.println("Guess a number between 1 to 20");
		
		while(guess != guessnum){
			System.out.print("Enter you guess:");
			guess=in.nextInt();
			attempts++;
			
			if(guess<guessnum) {
				System.out.println("too low! try again");
			}else if(guess>guessnum) {
				System.out.println("too high! try agein");
			}else {
				System.out.println("nice! you nailed it in  "+attempts+" time");
			}
		}

	}

}
