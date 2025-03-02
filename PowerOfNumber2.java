import java.util.*;

class PowerOfNumber2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int number;
		System.out.print("Enter the number: ");
		number = sc.nextInt();
		
		System.out.print("Enter the power: ");
		int power = sc.nextInt();
		
		int result = 1;
		
		int i=1;
		while(i<=power){
			result = result*number;
			i++;
		}
		
		System.out.println("Power of " + number + " is: " + result);
	}
}