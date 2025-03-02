import java.util.*;

class HarshadNumber{

	public static int digitSum(int num){
		
		int sum = 0;
		while(num>0){
			int rem = num%10;
			sum+=rem;
			num/=10;
		}
		return sum;		
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		boolean isHarshad = false;
		int sum = digitSum(number);
		
		if(number%sum==0){
			isHarshad = true;
		}
			
		System.out.print("Given Number " + number + " is Harshad Number : "+isHarshad);
		
	}

}