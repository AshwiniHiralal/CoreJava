package feb1;

//CodingBat
public class NotString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NotString s= new NotString();
		s.startWithNot("testname");
		s.startWithNot("notball");
		
		
		
		
	}



    public void startWithNot(String str)
    {
	
    	
    	boolean result = str.startsWith("not");
    	
    	if(result)
    	{
    		System.out.println("String starts with the not : "+str);
    	}
    	else
    	{
    		System.out.println("String doesn't starts with the not : "+str);
    		System.out.println("not"+str);
    	}
    	
   }

}