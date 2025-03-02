import java.util.*;

class Factors{
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
		
		for(int i=1;i<=number;i++){
			if(number%i==0){
				System.out.println(i);
			}
		}
	}
}