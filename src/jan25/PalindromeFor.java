package jan25;

public class PalindromeFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int num=1;num<=1000;num++)
		{
		    int rev=0;
		    int reminder=0;
		  //  int num=191;
		    int original=num;
		
		
		while(original>0)
		{
			reminder = original%10;    //reminder=191%10 ::reminder=1
			rev=(rev*10) +reminder;    //rev= (0*10)+1   ::rev=1
			original=original/10;     //original= 191/10   ::original=19
			
			                         //reminder=19%10 ::reminder=9
			                        ////rev= (1*10)+9   ::rev=19
			                        //original= 19/10   ::original==1
			                        
		}
		 if(num==rev)
		 {
			 System.out.println("No is palindrome  : "+num);
			 
		
		 }
		
		
		}
		
	}

}
