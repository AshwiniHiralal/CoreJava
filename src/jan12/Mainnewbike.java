package jan12;

public class Mainnewbike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Newbike hero=new Newbike("Pulsar",300,7);
		 hero.displyname();
		 hero.speed();
		 int res= hero.geardisplay();
		 System.out.println("The gears are "+res);
	}
	

}
