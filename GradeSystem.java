import java.util.Scanner;

class GradeSystem{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Marks in Physics: ");
		int physicsMarks = sc.nextInt();
		
		System.out.print("Marks in Chemistry: ");
		int chemistryMarks = sc.nextInt();
		
		System.out.print("Marks in Maths: ");
		int mathsMarks = sc.nextInt();
		
		int totalMarksScored = physicsMarks+chemistryMarks+mathsMarks;
		double percentage = (totalMarksScored*100)/300;
		
		if(percentage>=80){
			System.out.print("Level 4, above agency-normalized standards");
		}
		else if(percentage>=70 && percentage<80){
			System.out.print("Level 3, at agency-normalized standards");
		}
		else if(percentage>=60 && percentage<70){
			System.out.print("Level 2, below, but approaching agency-normalized standards");
		}
		else if(percentage>=50 && percentage<60){
			System.out.print("Level 1, well below agency-normalized standards");
		}
		else if(percentage>=40 && percentage<50){
			System.out.print("Level 1, too below agency-normalized standards");
		}
		else{
			System.out.print("Remedial standards");
		}
		
		
	}
}