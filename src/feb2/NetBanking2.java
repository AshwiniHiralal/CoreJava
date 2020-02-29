package feb2;

public abstract class NetBanking2 extends NetBanking {
	
	public abstract void  test();
	
  public void setPassword()
  {
	  System.out.println("Set ur pswd");
  }

  
  public void resetPassword() {
	  System.out.println("Rset ur password");
  }
  
  
  public void mobile() {
	  System.out.println("Pay ur mobile bill");
  }
  
  public void mutualFund() {
	  System.out.println("Pay for ur mutualfund");
  }
}
