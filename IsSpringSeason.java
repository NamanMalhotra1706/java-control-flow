import java.util.Scanner;

class IsSpringSeason{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month: ");
		String month = sc.next().toLowerCase();
		
		
		System.out.print("Enter the date: ");
		int date = sc.nextInt();
		
		if(month.equals("march") && ( date >=20 && date<=31)){
			System.out.print("Its a Spring Season");
		}
		else if((month.equals("april") || month=="may") && ( date >=1 && date<=31)){
			System.out.print("Its a Spring Season");
		}
		else if(month.equals("june") && ( date >=1 && date<=20)){
			System.out.print("Its a Spring Season");System.out.print("Its a Spring Season");
		}
		else{
			System.out.print("Its not a Spring Season");
		}
				
	}
}