package model;

public class CartItems
{
	private int itemCode;
	private String itemName;
	private double itemPrice;
	private int itemQuantity;
		
	public CartItems(int itemCode, String itemName, double itemPrice, int itemQuantity)
	{
		super();
		this.itemCode = itemCode;
		this.itemPrice = itemPrice;
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
	}

	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}	
}
