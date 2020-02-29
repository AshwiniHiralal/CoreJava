package jan18;

public class StaticInstance {

	
	int counter1=0; //instance variable
	static int counter2=0; //class variable
	void counting()
	{
		counter1++;
		counter2++;
		
		
	}
	void value()
	{
		System.out.println("Counter1 vale is :"+counter1);
		System.out.println("Counter2 vale is :"+counter2);
	}
	
	void display()
	{
		System.out.println("Counter1++ (inastance variable) : "+counter1);
		System.out.println("Counter2++ (static variable) : "+counter2);
		System.out.println("");
		
	}
	
	
}
