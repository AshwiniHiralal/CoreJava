package feb2;

import java.util.Scanner;

public class MulitipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= null;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str= sc.nextLine();
		
		try
		{
			System.out.println("Length of the string"+s.length());
			System.out.println("Chaacter at the gioven index in the given string"+str.charAt(5));
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			
		}
		catch (Exception e)
		{
			System.out.println();
		}
		
		
		
		
		
		

	}

}
