package feb1;

public class B extends A {

	int sum=0;
	
    void add(int x,int y)
    {
    	sum=x+y;
    	System.out.println("From class B method");
    	
    	System.out.println(sum);
    }
}
