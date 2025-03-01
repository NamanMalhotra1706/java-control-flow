import java.util.Scanner;

class NaturalNumber2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		int whileSum = 0;
		int num = number;
		
		while(num>0){
			whileSum += num;
			num--;
		}
		
		if(number>=0){
			System.out.println("The sum of " + number + " natural number is " + (number*(number+1))/2);
			System.out.println("Sum using while loop : " + whileSum);
			if(whileSum == (number*(number+1))/2){
				System.out.print("Both are Equal");
			}
		}
		else{
			System.out.print("The number " + number + " is not a natural number");
		}
		
		
	}
}