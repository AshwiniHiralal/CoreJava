package jan12;

public class Student {
	
	String name;
	int id;
	String clgname;
	String deptname;
	
	
	Student(String iname, int iid, String iclg, String dept)
	{
		name=iname;
		id=iid;
		clgname=iclg;
		deptname=dept;
		
	}
	
	Student(String iiname, int iiid, String idept)
	{
		name=iiname;
		id=iiid;
		clgname="COEP";
		deptname=idept;
		
	}
	
	
	void attenlecture()
	{
		System.out.println(name +" attends lecture with the id :"+id);
		
	}
	
	void gocollege()
	{
		System.out.println(name +" goes to the colleg :" +clgname);
	}
	
	
	void gotodept()
	{

		System.out.println(name +" goes to the colleg :" +deptname);
	   System.out.println();
	}
	 
	String returnname()
	{
		return name;
	}
	

}
