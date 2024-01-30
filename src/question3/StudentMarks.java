package question3;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 0;
		Scanner input=new Scanner(System.in);
		int in=input.nextInt();
		
		if(marks>79) {
			System.out.println("Excelent");
		}
		else if (marks>=70 && (marks<=79)) {
			System.out.println("Very good");
		}
		else if (marks>=60 && (marks<=69)) {
			System.out.println("Very good");
		}

}}
