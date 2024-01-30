package questionThree.b;


import java.util.Scanner;

public class StockTestLecturer {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Item ID:");
        int itemId = scanner.nextInt();
        stock.setItemId(itemId);

        System.out.println("Enter Quantity:");
        int quantity = scanner.nextInt();
        stock.setQuantity(quantity);

        System.out.println("Enter Price:");
        int price = scanner.nextInt();
        stock.setPrice(price);

        // Displaying the calculated amount received
        int amountReceived = stock.calculateTheAmountreceived(stock.getQuantity(), stock.getPrice());
        System.out.println("Amount Received: " + amountReceived);

        // Displaying the calculated quantity after selling
        System.out.println("Enter Selling Price:");
        int sellingPrice = scanner.nextInt();
        int quantityAfterSell = stock.calculateQuantityAfterSell(sellingPrice);
        System.out.println("Quantity After Selling: " + quantityAfterSell);
    }
}

