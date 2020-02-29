package jan19Hw;
import java.util.Scanner;


public class LargeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Eneter the value of X ");
		
		Scanner LargeNo = new Scanner(System.in);
		int x=LargeNo.nextInt();
		

		System.out.println("Eneter the value of Y ");
		int y=LargeNo.nextInt();
		
		System.out.println("Enetr the value of z");
		int z=LargeNo.nextInt();
		
		if(x>y && x>z)
		{
			System.out.println("X is the greater no");
		}
		else if(y>z)
		{
			System.out.println("Y is the greater no");
		}
		else
			
		{
			System.out.println("Z is the greater no");
		}
		LargeNo.close();
		
	}

}
