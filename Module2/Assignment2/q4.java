import java.util.*;

class bill{
	String cname;
    double units; 
	double amt; 
	
	bill()
	{
		cname = null ; 
		units = 0.0 ; 
		amt = 0.0 ;  
	}
	void calculateBillAmount()
	{
		if (this.getUnits()<= 100)
		{
			this.amt = this.getUnits() * 5.0 ;
		}
		else if (this.getUnits()>100 && this.getUnits()<=200)
		{
			this.amt = this.getUnits() * 7.0 ;
		}
		else 
		{
			this.amt = this.getUnits() * 10.0 ;
		}
		
	}
	
  
  void setCname(String cname)
  {
    this.cname = cname;
  }
  void setUnits(double units)
  {
    this.units = units;
  }
  // getters
   
  String getCname()
  {
    return this.cname ;
  }
   double getUnits()
  {
    return this.units;
  }
   double getAmt()
  {
    return this.amt;
  }
 

   
}

class q4{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter cust. name");
	String cn = sc.next();
	System.out.println("Enter units");
	double u = sc.nextDouble();
	bill b1 = new bill();
	b1.setCname(cn);
	b1.setUnits(u);
	b1.calculateBillAmount();
	double amount = b1.getAmt();
	System.out.println(b1.getCname() + "  Bill amount : "+ amount);
	
  }
}