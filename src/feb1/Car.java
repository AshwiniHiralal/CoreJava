package feb1;

public class Car {
	
	private String name; //visibilyt within the only class
	
	String color; //scope of the dfault is the package level in all the class of this package
	
	
	void display() //Setter Method
	{
		System.out.println(name);
	}
	void set(String value) //Getter Method
	{
		name=value;
		
		
	}

}
