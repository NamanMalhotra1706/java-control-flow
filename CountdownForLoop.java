import java.util.Scanner;

class CountdownForLoop{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the time in seconds : ");
		int time = sc.nextInt();
		
		for(int i=time-1;i>0;i--){
			System.out.println(i);
		}
	}
}