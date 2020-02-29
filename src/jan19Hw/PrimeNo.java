package jan19Hw;

import java.util.Scanner;

public class PrimeNo{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("Enter the no");
		
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		
		int count=0;
		//System.out.println("Check whether no is prime or not");
		
		for(int i=1; i <=no; i++)
		{
		     if(no%i == 0)
		     {
			  count++;
			  
		     }

	    }
		
		if(count==2)
		{
			System.out.println("Numer is prime");
		}
		else
		{
			System.out.println("Given No is not prime");
		}
		sc.close();
		
	}
	

}
