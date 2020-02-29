package jan12;

public class mainBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike b=new Bike();
		b.display();
		b.speed(60);
		int result = b.gear();
		System.out.println("My bike has no of gears "+ result);
	}

}
