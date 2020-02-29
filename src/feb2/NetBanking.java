package feb2;

public abstract class NetBanking implements  BillPayment{

	
	public void setUserName()
	{
		System.out.println("U can set ur username");
	}
	
	public void neft()
	{
		System.out.println("U can trasfer money via NEFT");
	}
	
	
	public void electricity()
	{
		System.out.println("U can pay ur electricity bill");
	}
	
	public void gas() {
		System.out.println("U can pay ur gas bill");
	}
	
	
}
