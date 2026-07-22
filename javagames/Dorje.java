package example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
public class Dorje {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			
			System.out.println("choose the correct one(dipak, gharti, magar, raila,)");
			String str=br.readLine();
			String[] name= {"dipak","gharti","magar","raila"};
			Random rn=new Random();
			String guess=name[rn.nextInt(name.length)];
			String input=str;
			if(input.equals(guess)) {
				System.out.println("Nice!");
				return;
			}else {
			
					System.out.println("once again");
					str=br.readLine();
			}
			System.out.println("end");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	}

