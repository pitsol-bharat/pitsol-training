package model;

import java.util.ArrayList;

public class List
{	
	static ArrayList<CartItems> itemsList = new ArrayList<CartItems>();
	static ArrayList<CartItems> cartList = new ArrayList<CartItems>();

	public static boolean addItem(CartItems e)
	{
		return itemsList.add(e);
	}

	public void clearCart() 
	{
		cartList.clear();
	}

	public static boolean removeItem(Object o) 
	{
		return itemsList.remove(o);
	}		
	
	public static ArrayList<CartItems> getItemsList() 
	{
		return itemsList;
	}
	public void setItemsList(ArrayList<CartItems> itemsList) 
	{	
		List.itemsList = itemsList;
	}

	
	public static boolean addToCart(CartItems e)
	{
		return cartList.add(e);
	}

	public static boolean removeFromCart(Object o) 
	{
		return cartList.remove(o);
	}		
	
	public static ArrayList<CartItems> getCartList() 
	{
		return cartList;
	}
	public void setCartList(ArrayList<CartItems> cartList) 
	{	
		List.cartList = cartList;
	}
	
}
