import java.util.*;

class IsMultiple{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		while(true){
			System.out.print("Enter the number: ");
			number = sc.nextInt();
			if(number <= 0){
				System.out.print("Number must be positive or less then 100");
			}
			else{
				break;
			}
		}
		for(int i=number;i>=1;i--){
			if(number%i==0){
				System.out.println(i);
			}
		}
	}
}