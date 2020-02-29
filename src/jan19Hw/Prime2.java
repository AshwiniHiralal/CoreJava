package jan19Hw;

public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Prime number between range 1 to 100");
		//int no;
		for(int i=1; i<=100; i++)
		{ int counter=0;
		counter++;
		
			for(int j=i; j>=1;j--)
			
			if(j%i==0)
			{
				System.out.println(i);
			}
			
			
		}

	}

}
