import java.util.Scanner;

class NaturalNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		if(number>=0){
			System.out.print("The sum of " + number + " natural number is " + (number*(number+1))/2);
		}
		else{
			System.out.print("The number " + number + " is not a natural number");
		}
	}
}