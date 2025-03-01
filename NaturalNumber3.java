import java.util.Scanner;

class NaturalNumber3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		int forSum = 0;
				
		for(int i=number;i>=0;i--){
			forSum += i;
			
		}
		
		if(number>=0){
			System.out.println("The sum of " + number + " natural number is " + (number*(number+1))/2);
			System.out.println("Sum using for loop : " + forSum);
			if(forSum == (number*(number+1))/2){
				System.out.print("Both are Equal");
			}
		}
		else{
			System.out.print("The number " + number + " is not a natural number");
		}
		
		
	}
}