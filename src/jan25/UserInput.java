package jan25;
import java.util.Scanner;


public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the no for craeting the table");
		Scanner sc= new Scanner(System.in);
		
		int no= sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(no+ " * "+ i +" = "+(no*i));
		}
		sc.close();
	}

}
