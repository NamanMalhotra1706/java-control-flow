import java.util.Scanner;

class Table{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number;
		
		while(true){
		
			System.out.print("Enter the number: ");
			number = sc.nextInt();
			
			if(number>=6 && number<=9){
				break;
			}
			else{
				System.out.println("Please enter the number between  6 to 9");
			}
		}
		
		for(int i=0;i<=10;i++){
			System.out.println( number + "*" + i + "=" + number*i);
		}
		
		
	}
}