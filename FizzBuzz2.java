import java.util.*;

class FizzBuzz2{
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
		
		int i = 1;
		
		while(i<=number){
			if(i%3==0){
				System.out.println("Fizz");
			}
			else if(i%5==0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(i);
			}
			i++;
		}	
	}
}