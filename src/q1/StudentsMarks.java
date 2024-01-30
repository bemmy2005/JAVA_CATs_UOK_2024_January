package q1;
import java.util.Arrays;
public class StudentsMarks {
		
		 public static void main(String[] args) {
		        // Student data
		        String[] students = {"Carine", "Ella", "Eden"};
		       double[][] scores = {
		                {15.9, 17.3, 19.7, 18.5},
		                {7.3, 8.2, 9.1, 8.2},
		                {11.3, 10.5, 13.2, 12}
		        };

		        // Calculate and display results
		        calculateAndDisplay(students, scores);
		    }

		    static void calculateAndDisplay(String[] students, double[][] scores) {
		        // Calculate percentage, average, max, and min
		        int numStudents = students.length;
		        int numSubjects = scores[0].length;

		        double[] percentages = new double[numStudents];
		        double[] averages = new double[numSubjects];
		       double[] mins = new double[numSubjects];
		        double[] maxs = new double[numSubjects];

		        for (int i = 0; i < numSubjects; i++) {
		            double[] column = new double[numStudents];
		            for (int j = 0; j < numStudents; j++) {
		                column[j] =  scores[j][i];
		            }

		            // Calculate average, min, and max for each subject
		            averages[i] = calculateAverage(column);
		            mins[i] = findMin(column);
		            maxs[i] = findMax(column);
		        }

		        for (int i = 0; i < numStudents; i++) {
		             //Calculate percentage for each student
		            percentages[i] = calculatePercentage(scores[i]);
		        }

		        // Display results
		        System.out.printf("%-10s%-15s%-15s%-15s%-10s%-10s%n", "Students", "Math/20", "French/10 ",
		                "Chemistry/10", "Max","Min");

		        for (int i = 0; i < numStudents; i++) {
		            System.out.printf("%-10s", students[i]);
		            
		            for (int j = 0; j < numSubjects; j++) 
		            {
		                System.out.printf("%-15d ", scores[i][j]);
		            }
		            System.out.printf("%-15.1f", percentages[i]);
		            System.out.printf("%-15.1f%n", percentages[i]);
		            
		           
		        }

		        // Display  Min, Max
		      
		        System.out.println();

		        System.out.printf("%-10s", "Min");
		        for (double min : mins) {
		            System.out.printf("%-15d ", min);
		        }
		        System.out.println();

		        System.out.printf("%-10s", "Max");
		        for (double max : maxs) {
		            System.out.printf("%-15d ", max);
		        }
		    }

		    static double calculatePercentage(double[] scores) {
		        int sum = 0;
		        for (double score : scores) {
		            sum += score;
		        }
		        return (double) sum / scores.length;
		        
		    }

		    static double calculateAverage(double[] scores) {
		        int sum = 0;
		        for (double score : scores) {
		            sum += score;
		        }
		        return (double) sum/ scores.length;
		    }

		    static double findMin(double[] array) {
		        return Arrays.stream(array).min().orElse(0);
		    }

		    static double findMax(double[] array) {
		        return Arrays.stream(array).max().orElse(0);
		    }

	}



