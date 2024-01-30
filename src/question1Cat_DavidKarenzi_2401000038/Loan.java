package question1Cat_DavidKarenzi_2401000038;

public class Loan {

	int amount;
	int interest_rate;
	int duration;
	int amounttobereturned;
	double RemainingAmountAfterGivingLoan;
	int CalculateInterest;
	double CalculatetotalamountTobereturned;
	
	public double getRemainingAmountAfterGivingLoan() {
		return RemainingAmountAfterGivingLoan;
	}
	public void setRemainingAmountAfterGivingLoan(int remainingAmountAfterGivingLoan) {
		RemainingAmountAfterGivingLoan = (amount+interest_rate)*0.05;
	}
	public int getCalculateInterest() {
		return CalculateInterest;
	}
	public void setCalculateInterest(int calculateInterest) {
		CalculateInterest = interest_rate*amount/duration;
	}
	public double getCalculatetotalamountTobereturned() {
		return CalculatetotalamountTobereturned;
	}
	public void setCalculatetotalamountTobereturned(int calculatetotalamountTobereturned) {
		CalculatetotalamountTobereturned = (amount*duration)*0.05;
	}
}
