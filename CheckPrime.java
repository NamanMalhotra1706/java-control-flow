import java.util.*;

class CheckPrime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		boolean isPrime = true;
		
		for(int i=2;i<number;i++){
			if(number%i==0){
				isPrime = false;
				break;
			}
		}
		
		System.out.print("Given Number " + number + " is Prime : "+isPrime);
		
	}

}