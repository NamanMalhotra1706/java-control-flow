import java.util.*;

class PowerOfNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int number;
		System.out.print("Enter the number: ");
		number = sc.nextInt();
		
		System.out.print("Enter the power: ");
		int power = sc.nextInt();
		
		int result = 1;
		
		for(int i=1;i<=power;i++){
			result = result*number;
		}
		
		System.out.println("Power of " + number + " is: " + result);
	}
}