package q3;

import java.util.Scanner;

public class Q3A {
	private static float marks;
public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the marks:");
	marks=scanner.nextFloat();
	if(marks<50)
	{
		System.out.println("Fail");
	}
	else if(marks>=50 && marks<=59)
	{
		System.out.println("Pass");
	}
	else if(marks>=60&&marks<=69)
	{
		System.out.println("Satisfactory");
	}
	else if(marks>=70 && marks<=79)
	{
		System.out.println("Very Good");
	}
	else if(marks>=80)
	{
		System.out.println("Excellent");
	}
	
	

	
}
}
