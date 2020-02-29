package jan25;

import java.util.Scanner;

public class PalinContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("Enter the no");
		Scanner ob=new Scanner(System.in);
		int number=ob.nextInt();
				
				
				
				int rev=0;
	          int reminder=0;
	        int original=number;
	        
	        
	        while(number>0)
	        {
	        	reminder =number%10;
	        	rev=(rev*10)+reminder;
	        	number=number/10;
	        	
	        	
	        }
	        
	        if(original==rev)
	        {
	        	System.out.println("No is the palindrome "+original);
	        	
	        
	        }
	        else
	        {
	        	System.out.println("No is not palindrome");
	        }

	        
	      
	        
	         
	        System.out.println("Do u wants to continue yes or no");
	        
	        String enter=ob.nextLine();
	        
	        while(enter.equals("yes"))
	        {
	        	
	        	
	        	System.out.println("Enter the no");
	    		
	    		int number2=ob.nextInt();
	    				
	    				
	    				
	    				int rev2=0;
	    	          int reminder2=0;
	    	        int original2=number2;
	    	        
	    	        
	    	        while(number2>0)
	    	        {
	    	        	reminder2 =number2%10;
	    	        	rev2=(rev2 * 10)+reminder2;
	    	        	number2=number2 / 10;
	    	        	
	    	        	
	    	        }
	    	        
	    	        if(original2==rev2)
	    	        {
	    	        	System.out.println("No is the palindrome "+original2);
	    	        	
	    	        
	    	        }
	    	        else
	    	        {
	    	        	System.out.println("No is not palindrome");
	    	        }
  ob.close();
	        	
	        }
	        
	        
	}

}
