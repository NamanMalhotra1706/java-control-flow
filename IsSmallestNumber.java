import java.util.Scanner;

class IsSmallestNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter the number: ");
		int number2 = sc.nextInt();
		
		System.out.print("Enter the number: ");
		int number3 = sc.nextInt();
		
		System.out.print("Is the first number the Smallest? ");
		
		if(number2>number1 && number3 > number1){
			System.out.print("Yes");
		}
		else{
			System.out.print("No");
		}
	}
	
}