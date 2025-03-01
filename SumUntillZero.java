import java.util.Scanner;

class SumUntillZero{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		while(true){
			System.out.print("Enter the number : ");
			int number = sc.nextInt();
			sum+=number;
			if(number ==0){
				break;
			}
		}
		
		System.out.print("Sum : " + sum);
		
	}
}