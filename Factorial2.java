import java.util.Scanner;

class Factorial2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		int Multiplication = 1;
		
		for(int i=number; i>0;i--){
			Multiplication *= i;
		}
		
		System.out.print("Factorial of " + number + " is : " + Multiplication);
	}
}