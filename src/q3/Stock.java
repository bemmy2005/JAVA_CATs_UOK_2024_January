package q3;

public class Stock {
	private int itemId;
	private int quantity=100;
	private float price;
	
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public void calculateQuntityAfterSell(int sellq) {
		quantity-=sellq;
		System.out.println("The quantity remin:"+quantity);
		
	}
	public void CalculatetheAmountreceived(float p,int qs)
	{
		
		price=p*qs;
		System.out.println("The amount received:"+price);
	}

}
