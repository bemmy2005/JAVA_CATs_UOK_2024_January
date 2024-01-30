package question1Cat_DavidKarenzi_2401000038;

public class LoanLecturer {

    int amount;
    int interestRate;
    int duration;
    double remainingAmountAfterGivingLoan;
    int calculateInterest;
    double calculateTotalAmountToBeReturned;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getRemainingAmountAfterGivingLoan() {
        return remainingAmountAfterGivingLoan;
    }

    public void setRemainingAmountAfterGivingLoan() {
        remainingAmountAfterGivingLoan = (amount + interestRate) * 0.05;
    }

    public int getCalculateInterest() {
        return calculateInterest;
    }

    public void setCalculateInterest() {
        if (duration != 0) {
            calculateInterest = interestRate * amount / duration;
        } else {
            System.out.println("Error: Duration cannot be zero.");
        }
    }

    public double getCalculateTotalAmountToBeReturned() {
        return calculateTotalAmountToBeReturned;
    }

    public void setCalculateTotalAmountToBeReturned() {
        calculateTotalAmountToBeReturned = (amount * duration) * 0.05;
    }
}
