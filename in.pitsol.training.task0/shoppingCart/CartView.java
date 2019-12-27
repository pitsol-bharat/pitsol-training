package shoppingCart;

import java.util.Scanner;

import controller.Manage;
import model.UniversalFunctions;

public class CartView 
{
	static Scanner kb = new Scanner(System.in);
	public static void main(String[] args)  
	{
		char exit='n';
		do
		{	
			System.out.println("\n\n\nSelect your Option : ");
			System.out.println("\t 1. MANAGE CART \n\t 2. MANAGE ITEMS");
			int choice = kb.nextInt();
			if(choice==1)
				manageCart();
			else if(choice==2)
				manageItems();
			else
				System.out.println("Enter Correct Option.........");
			System.out.println("Do You Want to Continue????");
			exit=kb.next().charAt(0);
		}while(exit=='y');
	}

	private static void manageItems()
	{
		char repeat='n';
		UniversalFunctions.clrscr();
		do
		{	
			System.out.println("\n\n\n\tSelect Option To Manage Items: ");
			System.out.println("\t 1. ADD NEW ITEM \n\t 2. REMOVE ITEM \n\t 3. UPDATE ITEM \n\t 4. SHOW ALL ITEMS");
			int ch=kb.nextInt();
			switch(ch)
			{
				case 1: Manage.addItem();
						break;
				case 2: Manage.deleteItem();
						break;
				case 3: System.out.println("What to Update ?? \n 1.PRICE OF ITEM \n 2. QUANTITY OF ITEM ");
						int c=kb.nextInt();			
						if(c==1) 
							Manage.updateItem("Price"); 
						else if(c==2)
							Manage.updateItem("Quantity");
						break;
				case 4: Manage.showItems();
						break;
			}
		}while(repeat=='y');
	}

	private static void manageCart() 
	{
		UniversalFunctions.clrscr();
		char repeat='n';
		UniversalFunctions.clrscr();
		do
		{	
			System.out.println("\n\n\n\tSelect Option To Manage Items: ");
			System.out.println("\t 1. ADD TO CART \n\t 2. REMOVE ITEM FROM CART \\n\\t 3. SHOW CART");
			int ch=kb.nextInt();
			switch(ch)
			{
				case 1: Manage.addToCart();
						break;
				case 2: Manage.deleteFromCart();
						break;
				case 3: Manage.showCart();
						break;
				default: System.out.println("Enter Correct Option."); 
			}
		}while(repeat=='y');
	}

}
