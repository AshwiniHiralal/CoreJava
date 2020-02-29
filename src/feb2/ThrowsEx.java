package feb2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx {

	public static void main(String[] args)throws Exception
	{
		// TODO Auto-generated method stub
		
		
		
       //openFile("abc.txt");
		myException("test");
		
		
	}
	
	public static void openFile(String path)throws FileNotFoundException
	{
		
		File f= new File(path);
		FileInputStream io =new FileInputStream(f);
		
	}
	
	public static void myException( String browsername)throws Exception
	{
		  if(browsername.equals("chrome"))
		  {
			  System.out.println("Chrome bowser");
		  }
		  
		  else if(browsername.equals("firefox"))
		  {
			  System.out.println("Firefox browser");
		  }
		  else
		  {
			  throw new Exception("Invalid brosername");
		  }
	}

}
