package question1Cat_DavidKarenzi_2401000038;

import java.util.Scanner;

public class TestLoan {
	int a;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the amount: ");
	TestLoan n=new TestLoan();
	n.setCalculatetotalamountTobereturned();
	n.setCalculateInterest();
	n.setRemainingAmountAfterGivingLoan(n);
	
	System.out.println("amount: "+n.setcalculateamountTobereturned());
	System.out.println("amount: "+n.setcalculateinterest());
	System.out.println("amount: "+n.setremainingamountaftergivingloan());

}
