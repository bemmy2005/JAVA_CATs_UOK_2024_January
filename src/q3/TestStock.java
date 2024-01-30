package q3;

import java.util.Scanner;

public class TestStock {

	public static void main(String[] args) {
		Stock stock=new Stock();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the item id:");
		int itid=scanner.nextInt();
		System.out.println("Enter the quantity sold:");
		int q=scanner.nextInt();
		System.out.println("Enter the price:");
		int pr=scanner.nextInt();
		stock.calculateQuntityAfterSell(q);
		stock.CalculatetheAmountreceived(pr, q);
	

	}

}
