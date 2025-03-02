import java.util.*;

class GreatestFactor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		while(true){
			if(number <= 0){
				System.out.print("Number must be positive");
			}
			else{
				break;
			}
		}
		
		for(int i=number-1;i>=1;i--){
			if(number%i==0){
				System.out.println(i);
				break;
			}
		}
	}
}