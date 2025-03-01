import java.util.Scanner;

class NumberStatus{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		if(number>0)System.out.print("Positive");
		else if(number<0)System.out.print("Negative");
		else System.out.print("Zero");

	}
}