package q2;

import java.util.Scanner;

public class TestLoan {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Loan ln=new Loan();
		
		System.out.print("Enter Loan amount: ");
				double lonAmount = scanner.nextDouble();
				System.out.print("Enter interest rate: ");
				double inr=scanner.nextDouble();
				System.out.print("Enter number of years: ");
				int nyear=scanner.nextInt();
				
				ln.calculateRemainingAmoutAfterGIvingLoan(lonAmount);
				ln.calculateInterest(lonAmount, inr, nyear);;
				ln.calculateTotalAmountTobeRetuned(lonAmount, inr, nyear);
			
		}
		
		
		
		
		
		

	}


