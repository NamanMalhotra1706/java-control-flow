import java.util.*;

class NumberOfDigits{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
			
		int originalNumber = number;
		int count = 0;
		
		while(number>0){
			number /= 10;
			count++;			
		}
		
		System.out.print("Given Number " + originalNumber + " has : "+count + " digits");
		
	}

}