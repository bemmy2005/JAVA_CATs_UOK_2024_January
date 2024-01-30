package questionThree.b;

public class Stock {
private int itemId;
private int quantity;
private int price;


public int getItemId() {
	return itemId;
}

public void setItemId(int itemId) {
	this.itemId = itemId;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

/*public int calculateQuantityAfterSell(int price) {
	int amount=this.calculateTheAmountreceived(this.getQuantity(),this.getPrice());
	return amount/price;
	
}*/

public int calculateQuantityAfterSell(int price) {
    int amount = this.calculateTheAmountreceived(this.getQuantity(), this.getPrice());
    
    // Check if the price is zero to avoid ArithmeticException
    if (price != 0) {
        return amount / price;
    } else {
        System.out.println("Error: Cannot divide by zero.");
        return 0; // or handle the error in an appropriate way for your application
    }
}

public int calculateTheAmountreceived(int q,int p) {
	return this.price*this.quantity;
	
}
}
