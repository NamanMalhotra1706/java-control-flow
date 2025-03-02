import java.util.*;

class BMI{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the weight: ");
		double weight = sc.nextDouble();
		
		System.out.print("Enter the height: ");
		int height = sc.nextInt();
	
		int cmToM = height/100;
		
		double bmi = weight/(cmToM*cmToM);
		
		System.out.println("BMI : " + bmi );
		
		if(bmi <=18.4){
			System.out.print("Underweight");
		}
		else if(bmi<=24.9 || bmi>=18.5){
			System.out.print("Normal");
		}
		else if(bmi>=25.0 || bmi<=39.9){
			System.out.print("Normal");
		}
		else if(bmi>=40.0){
			System.out.print("Obese");
		}
		
	}

}