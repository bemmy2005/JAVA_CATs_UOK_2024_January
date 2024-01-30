package q2;

public class Loan {
	private double amount=100000;
	private double irate;
	int numyears;
	private double amtreturned=0;
	private double inter=0;
	private double lamount;
		
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getIrate() {
		return irate;
	}
	public void setIrate(double irate) {
		this.irate = irate;
	}
	public int getNumyears() {
		return numyears;
	}
	public void setNumyears(int numyears) {
		this.numyears = numyears;
	}
	public double getLamount() {
		return lamount;
	}
	public void setLamount(double lamount) {
		this.lamount = lamount;
	}
	
	public void calculateRemainingAmoutAfterGIvingLoan(double lamount)
	{
		
		amount-=lamount;
		System.out.println("The remaining amount is:"+amount);
	}
	
	public void calculateInterest(double lamount,double irate,int ny) {
		
		System.out.println("The total interest is:"+(lamount*irate*ny));
	}
	
	public void calculateTotalAmountTobeRetuned(double lamount,double irate,int ny)
	{
		double retamt=lamount+(lamount*irate*ny);
		
		System.out.println("The returned amount is:"+retamt);
		
	}
	

	
}
