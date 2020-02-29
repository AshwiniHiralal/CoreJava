package jan19Hw;

public class DIvisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//int n=3; int no=5;
		
		for(int i=1; i<=100 ; i++)
		{
			
			 if((i%3==0 && i%5==0))
			{
				System.out.println("No is divisible by 3 & 5  : "+i);
			}
			 
			 else if (i%3==0)
			 {
				 System.out.println("No is divisible by 3      : "+i);
			 }
			 
			 else if(i%5==0)
			 {
				 System.out.println("No is divisible by 5      : "+i);
			 }
		}
		
	}

}
