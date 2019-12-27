package controller;
import java.util.ArrayList;
import java.util.Scanner;

import model.CartItems;
import model.List;

public class Manage 
{	
	static Scanner kb = new Scanner(System.in);
	public static void addItem()
	{
		System.out.println("\n");
		System.out.println("\tItem Code : ");
		int itemCode = kb.nextInt();
		System.out.println("\tItem Name : ");
		String itemName = kb.nextLine();
		System.out.println("\tItem Price : ");
		double itemPrice = kb.nextDouble();
		System.out.println("\tItem Quantity : ");
		int itemQuantity = kb.nextInt();
		
		CartItems Item=new CartItems(itemCode,itemName,itemPrice,itemQuantity);
		List.addItem(Item);
	}

	public static void showItems()
	{
		ArrayList<CartItems> l=List.getItemsList();
		if(l.isEmpty())
			System.out.println("\t\t THE LIST IS EMPTY .");
		else
		{	
			System.out.println("\t\t ITEM CODE \t ITEM NAME \t ITEM PRICE \tITEM QUANTITES");
			for(int i=0;i<l.size();i++)
			{
				CartItems item = l.get(i);
				System.out.println("\t\t "+item.getItemCode()+" \t\t "+item.getItemName()+" \t\t "+item.getItemPrice()+" \t\t "+item.getItemQuantity());	
			}
		}
	}
	
	public static void deleteItem()
	{
		System.out.println("Enter ITEM CODE : ");
		int itemCode = kb.nextInt();
		ArrayList<CartItems> l=List.getItemsList();
		int flag = 0;
		
		if(l.isEmpty())
			System.out.println("\t\t THE PRODUCT LIST IS EMPTY .");
		else
			for(int i=0;i<l.size();i++)
			{
				CartItems itemobj = l.get(i);
				if(itemCode == itemobj.getItemCode())
				{
					List.removeItem(itemobj);
					flag+=1;
					break;
				}
			}
		if(flag==0)
			System.out.println("NO ITEM FOUND WITH THIS ITEM CODE");
	}
	public static void updateItem(String s)
	{
		ArrayList<CartItems> l=List.getItemsList();
		if(l.isEmpty())
			System.out.println("\t\t THE PRODUCT LIST IS EMPTY .");
		else
		{
			
			System.out.println("Enter item Code to update ");
			System.out.println("\t\tITEM CODE  : ");
			int itemCode = kb.nextInt();
			int flag = 0;
			for(int i=0;i<l.size();i++)
			{
				CartItems itemobj = l.get(i);
				if(itemCode == itemobj.getItemCode())
				{
					if(s.equals("Price"))
					{
						System.out.println("ENTER NEW PRICE :");
						double newPrice=kb.nextDouble();
						itemobj.setItemPrice(newPrice);
						System.out.println("Quantity Updated");
						flag+=1;
						break;
					}
					else if(s.equals("Quantity"))
					{
						System.out.println("ENTER NEW QUANTITY :");
						int newQuantity=kb.nextInt();
						itemobj.setItemQuantity(newQuantity);
						System.out.println("Quantity Updated");
						flag+=1;
						break;
					}
				}
			}
			if(flag==0)
				System.out.println("NO ITEM FOUND WITH THIS ITEM CODE");
		}
	}
	public static void addToCart() 
	{
		showItems();
		System.out.println("\n\t Enter Item Code to Add TO CART : ");
		ArrayList<CartItems> l=List.getItemsList();
		int itemCode = kb.nextInt();
		int flag=0;
		for(int i=0;i<l.size();i++)
		{
			CartItems itemobj = l.get(i);
			if(itemCode == itemobj.getItemCode())
			{	flag++;
				List.addToCart(itemobj);
				System.out.println("\t\t Item ADDED To Cart");
				break;
			}
		}
		if(flag==0)
			System.out.println("ITEM NOT FOUND");
	}
	public static void deleteFromCart() 
	{
		showCart();
		System.out.println("\n\t Enter Item Code to REMOVE FROM CART : ");
		int itemCode = kb.nextInt();
		ArrayList<CartItems> l=List.getCartList();
		
		int flag=0;
		for(int i=0;i<l.size();i++)
		{
			CartItems itemobj = l.get(i);
			if(itemCode == itemobj.getItemCode())
			{	flag++;
				List.removeFromCart(itemobj);
				System.out.println("\t\t Item REMOVED FROM Cart");
				break;
			}
		}
		if(flag==0)
			System.out.println("ITEM NOT FOUND");
	}

	public static void showCart() 
	{
		ArrayList<CartItems> l=List.getCartList();
		if(l.isEmpty())
			System.out.println("\t\t THE CART IS EMPTY .");
		else
		{	
			System.out.println("\t\t ITEM CODE \t ITEM NAME \t ITEM PRICE \tITEM QUANTITES");
			for(int i=0;i<l.size();i++)
			{
				CartItems item = l.get(i);
				System.out.println("\t\t "+item.getItemCode()+" \t\t "+item.getItemName()+" \t\t "+item.getItemPrice()+" \t\t "+item.getItemQuantity());
			}
		}
	}
	
}
