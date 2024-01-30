package quetion_3_a;
import java.util.Scanner;
public class Student_Marks {
	public static void main(String[] args) {
		double mark;
		System.out.println("Enter The Marks Of Students:");
	    Scanner Marks= new Scanner(System.in);
		mark= Marks.nextDouble();
		if(mark>79) {
			System.out.println("Excellent");
		}
		else if(mark>=79 || mark<=70) {
			System.out.println("Very Good");
		}
		else if(mark>=69 || mark<=60) {
			System.out.println("Satisfictory");
		}
		else if(mark>=59 || mark<=50) {
			System.out.println("Pass");
		}
		else if(mark<50) {
			System.out.println("Fail");
		}
		else {
			System.out.println("   ");
		}
	}

}
