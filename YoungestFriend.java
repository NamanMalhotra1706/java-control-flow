import java.util.Scanner;

class YoungestFriend{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amar age: ");
		int amarAge = sc.nextInt();
		
		System.out.print("Akbar age: ");
		int akbarAge = sc.nextInt();
		
		System.out.print("Anthony age: ");
		int anthonyAge = sc.nextInt();
		
		if(amarAge >= akbarAge && amarAge >=anthonyAge){
			System.out.println("Amar is tallest friend");
		}
		else if(anthonyAge>=amarAge && anthonyAge>= akbarAge){
			System.out.println("Anthony is tallest friend");
		}
		else if(akbarAge>=amarAge && anthonyAge<= akbarAge){
			System.out.println("Akbar is tallest friend");
		}
		
		if(amarAge <= akbarAge && amarAge <=anthonyAge){
			System.out.print("Amar is youngest friend");
		}
		else if(anthonyAge<=amarAge && anthonyAge<= akbarAge){
			System.out.print("Anthony is youngest friend");
		}
		else if(akbarAge<=amarAge && anthonyAge>= akbarAge){
			System.out.print("Akbar is youngest friend");
		}
		
	}
}