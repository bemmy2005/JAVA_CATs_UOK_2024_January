package quetion_3_a;

public class Stock {
	int itemId;
	double Quantity;
	double Price;
	public Stock(int itemId, double quantity, double price) {
		super();
		this.itemId = itemId;
		Quantity = quantity;
		Price = price;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public double getQuantity() {
		return Quantity;
	}
	public void setQuantity(double quantity) {
		Quantity = quantity;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
}
