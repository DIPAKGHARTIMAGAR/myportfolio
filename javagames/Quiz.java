import java.util.Random;
import java.util.Scanner;
public class Quiz {
	
	public static void main(String[] args) {
		Random ran=new Random();
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Do you want's to start the game!");
		System.out.println("Answer with Yes ro No");
			String in=scn.nextLine();
		if(in.equals("Yes")) {
			
			System.out.println("What is Dipak's favorite subject?");
			System.out.println("Choose from given subjects");
		}else {
			return;
			
		}
		String ans="Java";
			System.out.println("Office,Database,Html,Java,Php,MySQL");
		String an=scn.nextLine();
		int atmp=1;
		if(an.equals(ans)) {
			System.out.println("Nice! you have answered in 1st attempt");
			return;
		}else {
			System.out.println("Wrong! i will give you 2 more chance");
		
		String tr=scn.nextLine();
		for(int i=1;i<=2;i++) {
		if(tr.equals(ans)) {
			System.out.println("Nice! you have answered in 2st attempt");
			return;
		}else {
		String str=scn.nextLine();
		if (!str.equals(ans)) {
			System.out.println("Sorry! you couldn't answered it");
			return;
		}else {
			System.out.println("Welldone! you have answered in your last chance");
		}
				
			
		}
	}
}}}