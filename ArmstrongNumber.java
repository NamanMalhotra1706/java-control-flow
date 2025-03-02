import java.util.*;
import java.lang.*;

class ArmstrongNumber{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		boolean isArmstrong = true;
		
		int originalNumber = number;
		int sum = 0;
		
		while(number>0){
			
			int rem = number%10;
			sum = sum+(rem*rem*rem);
			number /= 10;
					
		}
		
		System.out.print("Given Number " + originalNumber + " is Armstrong Number : "+isArmstrong);
		
	}

}