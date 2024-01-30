package question1Cat_DavidKarenzi_2401000038;


import java.util.Random;
import java.util.Scanner;

public class Studentmarks {
	
	 private static final int[] mathMarks = null;
	private static int french;

	public static void main(String[] args) {
		 int math=0;
	     int french=0;
	     int chemisrty=0 ;
	     
	     int minfrench=0;
	     int minchemistry=0 ;
	    
	     int maxfrench=0;
	     int maxchemistry=0 ;
	   
	     int totalMarks =0;
	     double Max=0;
	     double Min=0;

	     int minMaths = 0 ;
	     int maxMaths=0;
	        String[] students = {"Math/20", "French/10", "Chemestry/15"};
	       
	        double[] mathsMarks = {15.9, 17.3, 19.7, 18.5};
	        double[] frenchMarks = {7.3, 8.2, 9.1, 8.2};
	        double[] chemisrtyMarks = {11.3, 10.5, 13.2, 12.5};
	       
	        System.out.println("\r------------------------------------------------------------------------------------------------");
	        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
	                "|Student", "|Carine", "|Ella", "|Edena","|Ellen", "|Max", "|Min");
	        System.out.println("------------------------------------------------------------------------------------------------");
	        for (int i = 0; i < students.length; i++) {
	             math = mathMarks[i];
	           french = (int) frenchMarks[i];
	           chemisrty = (int) chemisrtyMarks[i];
	             

	             totalMarks = Carine + Ella + Edena + Ellen + Max + Min;
	             Max = (double) totalMarks / 4;
	            Min = (double) totalMarks / 4;

	           minMaths = (int) Math.min(mathsMarks[0],Math.min(mathsMarks[1],mathsMarks[2]));
	           maxMaths = (int) Math.max(mathsMarks[0],Math.max(mathsMarks[1],mathsMarks[2]));
	           
	           minfrench = (int) Math.min(math[0],Math.min(french[1],chemisrty[2]));
	           maxfrench = (int) Math.max(frenchMarks[0],Math.max(frenchMarks[1],french[2]));
	           
	           minchemistry = (int) Math.min(chemisrty[0],Math.min(cehmistyMarks[1],maxchemistry[2]));
	           maxchemistry = (int) Math.max(chemisrtys[0],Math.max(chemistyMarks[1],chemistryMarks[2]));
	           
	           
	        

	            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%\n",
	            		""+maxMaths, "|"+french, "|"+chemestry, "| "|"+Average,|"/""+Percentage");
	            System.out.println("------------------------------------------------------------------------------------------------");
	        }
	       
	        
	        	 System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
		                    "|Min", "|"+minMaths, "|"+minfrench, "|"+minchemistry, " ");
	        	 System.out.println("------------------------------------------------------------------------------------------------");
	        	 System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
		                    "|Max", "|"+maxMaths, "|"+maxfrench, "+maxchemistry, ");
	        	 System.out.println("------------------------------------------------------------------------------------------------");
	    }

	}
