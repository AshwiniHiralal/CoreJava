package jan12;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Student s=new Student("Ashu",10,"SSBT", "C0mputer");
		 
		  s.attenlecture();
		  s.gocollege();
		  s.gotodept();
		 
		  Student s1=new Student("Jayu",11, "Mechanical");
			 
		  s1.attenlecture();
		  s1.gocollege();
		  s1.gotodept();
		  
		  String name= s1.returnname();
		  System.out.println(name);
		  
		  
	}

}
