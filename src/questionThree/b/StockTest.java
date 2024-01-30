package questionThree.b;

import java.util.Scanner;

public class StockTest {
public static void main(String[] args) {
	Stock stock=new Stock();
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter Quqntity:");
	
	int quantity=scanner.nextInt();
	
System.out.println("Enter Price:");
	
	int price=scanner.nextInt();
	
	
	System.out.println(stock.calculateTheAmountreceived(stock.getQuantity(),stock.getPrice()));
	System.out.println(stock.calculateQuantityAfterSell(stock.getPrice()));
}
}
