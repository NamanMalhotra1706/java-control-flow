import java.util.*;

class MultipleOfNumber{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		while(true){
			System.out.print("Enter the number: ");
			number = sc.nextInt();
			if(number <= 0|| number>100){
				System.out.println("Number must be positive or less than 100 ");
			}
			else{
				break;
			}
		}
		
		int i = number-1;
		while(i>1){
			if(number%i==0){
				System.out.println(i);
			}
			i--;
		}		
	}
}