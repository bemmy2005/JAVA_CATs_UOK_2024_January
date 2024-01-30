package question2;
import java.util.Scanner;
public class Loan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter loan duration in years: ");
        int loanDurationYears = scanner.nextInt();

        double interest = calculateInterest(loanAmount, annualInterestRate, loanDurationYears);
        double totalAmount = loanAmount + interest;
        double remainingAmount = totalAmount - loanAmount;

        System.out.println("\nLoan Details:");
        System.out.println("Loan Amount: $" + loanAmount);
        System.out.println("Annual Interest Rate: " + annualInterestRate + "%");
        System.out.println("Loan Duration: " + loanDurationYears + " years");

        System.out.println("\nCalculated Details:");
        System.out.println("Interest: $" + interest);
        System.out.println("Total Amount to be Repaid: $" + totalAmount);
        System.out.println("Remaining Amount after Giving Loan: rwf" + remainingAmount);

        scanner.close();
    }

    private static double calculateInterest(double loanAmount, double annualInterestRate, int loanDurationYears) {
      
        double monthlyInterestRate = annualInterestRate / 100 / 12;

        int numberOfPayments = loanDurationYears * 12;

        double interest = loanAmount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        return interest * numberOfPayments - loanAmount;
    }
}



