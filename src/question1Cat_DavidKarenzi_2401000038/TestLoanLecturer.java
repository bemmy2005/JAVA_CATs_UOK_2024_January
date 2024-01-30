package question1Cat_DavidKarenzi_2401000038;

import java.util.Scanner;

public class TestLoanLecturer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount: ");
        int amount = input.nextInt();

        System.out.println("Enter the interest rate: ");
        int interestRate = input.nextInt();

        System.out.println("Enter the duration: ");
        int duration = input.nextInt();

        LoanLecturer loan = new LoanLecturer();
        loan.setAmount(amount);
        loan.setInterestRate(interestRate);
        loan.setDuration(duration);

        loan.setCalculateTotalAmountToBeReturned();
        loan.setCalculateInterest();
        loan.setRemainingAmountAfterGivingLoan();

        System.out.println("Total amount to be returned: " + loan.getCalculateTotalAmountToBeReturned());
        System.out.println("Calculated interest: " + loan.getCalculateInterest());
        System.out.println("Remaining amount after giving loan: " + loan.getRemainingAmountAfterGivingLoan());
    }
}
