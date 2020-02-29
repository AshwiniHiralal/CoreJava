package jan19Hw;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value=123;
		int reminder;
		int reverseN=0;
		
		
		int original = value;
		
		System.out.println("Original value is"+original);
		
		
		while (value != 0) 
		{
	        reminder = value % 10;
	        reverseN = reverseN * 10 + reminder;
	        value= value/10;
	    }
		
		System.out.println("Reverse no is "+reverseN);

	}

}
