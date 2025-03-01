import java.util.Scanner;

class Countdown{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the time in seconds : ");
		int time = sc.nextInt();
		
		while(time-->0){
			System.out.println(time);
		}
	}
}