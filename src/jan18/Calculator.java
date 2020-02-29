package jan18;

public class Calculator
{
	static int a;
	static int b;
	int c;
	int result;
		

 Calculator()
{
	 a=20;
	 b=10;
	 
}
 
 void add()
 {
	 int result=a+b;
	 
	System.out.println("Addition is:"+result);
 }
 
 void sub()
 {
	 int result= a-b;
	 System.out.println("Subtraction is:"+result);
 }
 void mul()
 {
	 int result=a*b;
	 System.out.println("Multiplication is:"+result);
 }
 void div()
 {
	   int result=a/b;
	   System.out.println("Division is:"+result);
	 
 }
 
}
