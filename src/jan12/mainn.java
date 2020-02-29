package jan12;

public class mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methods m=new Methods();
		m.display("Pavan");
		m.display("Sandip foundation");
		
		String res= m.brname("Electrical");
		System.out.println("Branch name is "+res);
		
		int result = m.add(10,20);
		System.out.println("Addition is the "+result);
	}
	
}
