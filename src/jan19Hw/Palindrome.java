package jan19Hw;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value=121;
		int reminder;
		int reverseN=0;
		
		
		int original = value;
		
		System.out.println("Original value is"+original);
		System.out.println("Checking given no is palindrome or not");
		
		while (value != 0) 
		{
	        reminder = value % 10;
	        reverseN = reverseN * 10 + reminder;
	        value= value/10;
	    }
		
		if(original==reverseN)
			System.out.println("No is palindrome");
		else
			System.out.println("No is not palindrome");
		
		
	}

}
