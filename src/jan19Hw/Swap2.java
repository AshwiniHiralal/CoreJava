package jan19Hw;

public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y=5;
		
		System.out.println("Before swapping");
        System.out.println("Vlaue of the X is"+x);
        System.out.println("Value of the Y is"+y);
        
       System.out.println("After swapping"); 
       x=x+y; // x=10(x)+5(y)  :: x=15
       y=x-y;  //y=15(x)-5(y) :: y=10
       x=x-y;   //x=15(x)-10(y) ::x=5
       
       System.out.println("Vlaue of the X is"+x);
       System.out.println("Value of the Y is"+y);
        
	}

}
