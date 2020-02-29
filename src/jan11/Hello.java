package jan11;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				System.out.println("This is my first program");
							
	//For nonstatic u need to create the object of the class for calling the method
				
				Hello2 h1= new Hello2();
				h1.testing();
				h1.my();
				h1.my2();
			
				Hello h= new Hello();
				h.run();
						
				
				test t= new test();
		
				display();
						
			
	}
	
	static void display()
	{
		System.out.println("Display");
	}
	
	

	void run()
	{
		System.out.println("Run without static");
	}

	
}
