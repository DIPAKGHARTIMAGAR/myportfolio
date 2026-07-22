package example;
import java.util.Scanner;
public class Kaluwa {
	static String Hawa(String a,String b) {
		return a+b;
		
	}
		        	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell me your name"); 
			String input = sc.nextLine();
	        System.out.println(Hawa("Hello ",input));
	        	
	        if(input.equals("dipak")){
	        	System.out.println("ひっさしぶり!!");
	        }else{
	        	System.out.println("元気??");
	        }
	}

}
