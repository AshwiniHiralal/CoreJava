package jan25;
import java.util.*;

public class UserInputPalindrome {

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

	        
	        ob.close();
	}

}
