import java.util.Scanner;

class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		int Multiplication = 1;
		int num = number;
		
		while(num>0){
			Multiplication *= num;
			num--;
		}
		
		System.out.print("Factorial of " + number + " is : " + Multiplication);
	}
}