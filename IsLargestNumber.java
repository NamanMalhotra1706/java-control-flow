import java.util.Scanner;

class IsLargestNumber{

	public static boolean isLargest(int number1,int number2, int number3){
		if(number1 > number2 && number1 > number3){
			return true;
		}
		return false;
	}
		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter the number: ");
		int number2 = sc.nextInt();
		
		System.out.print("Enter the number: ");
		int number3 = sc.nextInt();
		
		System.out.print("Is the First Number the largest? ");
		if(isLargest(number1,number2,number3)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		
		System.out.print("Is the Second Number the largest? ");
		if(isLargest(number2,number2,number3)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		
		System.out.print("Is the Third Number the largest? ");
		if(isLargest(number3,number1,number2)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}