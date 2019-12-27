package model;

import java.io.IOException;

public class UniversalFunctions 
{
	public static void clrscr()
	{
	    	//Clears Screen 
	    try 
	    {
	        if (System.getProperty("os.name").contains("Windows"))
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        else
	            Runtime.getRuntime().exec("clear");
	    } 
	    catch (IOException | InterruptedException ex) {}
	}
}
