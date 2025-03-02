import java.util.*;

class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int year;
		
		while(true){
			System.out.print("Enter the Year: ");
			year = sc.nextInt();
			if(year<1582){
				System.out.print("Year must me greater than 1582");
			}
			else{
				break;
			}
		}
		if(year%400==0){
			if(year%100==0){
				if(year%4==0){
					System.out.print("Leap Year");
				}
				else{
					System.out.print("Leap Year");
				}
			}
			else{
				System.out.print("Not a leap Year");
			}
		}
		else{
			System.out.print("Not a leap Year");
		}
	}
}