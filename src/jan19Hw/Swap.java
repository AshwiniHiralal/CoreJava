package jan19Hw;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x , y , temp;
		x=10;
		y=5;
		
		System.out.println("Before swapping");
		System.out.println("Value of the variable x is :"+x);
		System.out.println("Value of the variable y is :"+y);

		temp=x;
		x=y;
		y=temp;
		System.out.println();
		System.out.println("After the swapping");
		System.out.println("Value of the variable x is :"+x);
		System.out.println("Value of the variable y is :"+y);

	}

}
