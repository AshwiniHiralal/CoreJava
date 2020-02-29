package feb2;
import java.util.*;

public class Exceptionexa {

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
	    	
	    }
	    
	    catch(Exception e)	
	    {
	    	e.printStackTrace();
	    	System.out.println("There is the exception occure"+	e.getMessage());

	    	z=5;
	    }
	    
	    
	    for(int i=0;i<=z;i++)
	    {
	    	System.out.println(i);
	    }
	   
	 
  s.close();
  
	}

}
