package jan19Hw;
import java.util.Scanner;


public class PrimeInfinite {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("Eneter the no :");
		
		Scanner sc = new Scanner(System.in);
		 int number= sc.nextInt();
		
		int no;
		
		 for(no=1; no<=number; no++)
		 {
			 int count=0;
			 for(int i=1;i<=no;i++)
			 {
				 
				 if(no%i==0)
				 {
					 count++;
				 }
				 	
			 }
			
			 
		 
			 if(count==2)
			 {
				 System.out.println("Prime no is"+no);
				 
			 }
			 
			   
		
    sc.close();
				 
		 }

	}
}
