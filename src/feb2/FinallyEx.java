package feb2;

import java.util.Scanner;

public class FinallyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int x,y;
		
		int z=0;
		
		Scanner s= new Scanner(System.in);
		
	    System.out.println("Enter the value of the x");
	    x = s.nextInt();
	 
	    
	    System.out.println("Enter the value of the y");
	    y= s.nextInt();
	    
	    try
	    {
	    	z=x/y;
	    	System.out.println(z);
	    
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Exception "+e.getMessage());
	    }
	    finally
	    {
	    	System.out.println("I am in the final block");
	    }
	    s.close();
	    
	}
}
