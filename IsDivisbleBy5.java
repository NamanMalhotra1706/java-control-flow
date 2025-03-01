import java.util.Scanner;

class IsDivisbleBy5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		System.out.print("Is the number " + number + " divisible by 5? ");
		if(number%5 == 0){
			System.out.print("Yes");
		}
		else{
			System.out.print("No");
		}
	}
}