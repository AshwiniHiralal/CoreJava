package jan12;

public class Newbike {
	
	int speed;
	String name;
	int gears;
	
	Newbike(String iname, int ispeed, int igears){
		name=iname;
		speed=ispeed;
		gears=igears;
	}
	
	
	void displyname()
	{
		System.out.println("My Bike name is the :"+name);
	}
	
	void speed()
	{
		System.out.println("My bike speed is :"+speed);
	}

	int geardisplay()
	{
	  return gears;
	  
	}
}
