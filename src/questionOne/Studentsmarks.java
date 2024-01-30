package questionOne;

import java.util.Iterator;
import java.util.Scanner;

public class Studentsmarks {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String []students= {"Carine","Ella","Edena","Ellen"};
		String []subjects={"Math/20","Frenh/10","Chemistry/15"};
		float [][]marks= new float[students.length][subjects.length];
		
		for(int i=0;i<students.length;i++) {
			for(int j=0;j<subjects.length;j++) {
				System.out.println("Enter marks for "+students[i] +" Of subject "+subjects[j]);
				marks[i][j]=scanner.nextFloat();
			}
		}

		System.out.printf("%-15s"," ");
		for(int i=0;i<students.length;i++) {
			System.out.printf("%-15s", students[i]);
		}
		System.out.printf("%-15s%-15s%n", "Max","Min");
		
		for(int j=0;j<subjects.length;j++) {
			System.out.printf("%-15s", subjects[j]);
			double sum=0.0;
			double mx=marks[0][j];
			 double min=marks[0][j];
			for(int i=0;i<students.length;i++) {

				System.out.printf("%-15s", marks[i][j]);
				sum+=marks[i][j];
				mx=calculateMax(mx, marks[i][j]);
				min=calculateMin(min, marks[i][j]);
			}
			
			System.out.printf("%-15.1f%-15.1f%n", mx,min);
		}
		
	
		System.out.println();
	}

	public static double calculateMax(double max,double marks) {
		double max1=Math.max(max, marks);
		return max1;
	}
	public static double calculateMin(double min,double marks) {
		double min2=Math.min(min, marks);
		return min2;
	}
	private static double calculateAverage(double totalMarks, double numModules) {
		return  totalMarks / numModules;
	}
}
