package questionThree.a;

import java.util.Scanner;

public class Student {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
		
	System.out.println("Enter student marks");
	
	int mark=scanner.nextInt();
	
	if(mark<50) {
		System.out.println("Fail");
	}
	else if (mark>=50 && mark<=59) {
		System.out.println("Pass");	
	}
	else if (mark>=60 && mark<=69) {
		System.out.println("Satisfactory");	
	
	}
	else if (mark>=70 && mark<=79) {
		System.out.println("Very good");	
	}
	else if (mark>=79) {
		System.out.println("Excellent");	
	}
	else {
		System.out.println("No input provided");
	}
}
}
