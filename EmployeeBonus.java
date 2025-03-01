import java.util.Scanner;

class EmployeeBonus{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Salary: ");
		double salary = sc.nextInt();
		
		System.out.print("Enter the number of year of service: ");
		double year = sc.nextDouble();
		
		if(year>5.0){
			System.out.print("Hurray! you have more the 5 year of service, Your Bonus is " + (salary/100)*5);
		}
		else{
			System.out.print("No Bonus you have less then 5 year of service");
		}
		
	}
}