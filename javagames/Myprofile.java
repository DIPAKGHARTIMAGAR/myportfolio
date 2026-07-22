	class Hero{
		String name;
		String sex;
		int age;
		String country;
	
		void printH() {
			System.out.println("名前:"+name);
			System.out.println("性別:"+sex);
			System.out.println("年齢:"+age);
			System.out.println("国:"+country);
			
		}
	}
	class Manxe extends Hero{
		String hobby;
		
		void printP() {
			super.printH();
			System.out.println("趣味:"+hobby);
			
		}
		
	}
public class Myprofile {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Manxe dipak=new Manxe();
		dipak.name="DIPAK";
		dipak.sex="male";
		dipak.age=27;
		dipak.country="Nepal";
		dipak.hobby="programming";
		
		dipak.printH();
		
	}

}
