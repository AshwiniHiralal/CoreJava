package feb1;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the String");
		String value=s.nextLine();
		
		

		reverse(value);
		s.close();
		
	}
	
	public static void reverse(String name)
	{
		
		 System.out.println("Original string is the "+name);
		 System.out.println("Reverse string is the :");
		   
		   for (int i=name.length()-1;i>=0;i--)
		   {
			   char t= name.charAt(i);
			   
			   System.out.print(t);
			   
		   }	  
		   
		   
	}
	

}
