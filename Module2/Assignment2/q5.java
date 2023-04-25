import java.util.*;

class bill{
	String cname;
	long pno;
	int noc; // no . of calls 
	double doc;  // duration of calls
	
	
	bill()
	{
		cname = null ; 
		pno = 0 ; 
		noc = 0;
		doc = 0.0 ; 
	}
	double calculateBillAmount()
	{
		double bill ; // in dollars
		if (this.getNoc()<= 100)
		{
			bill = this.getNoc() * 0.50 + 10;
		}
		else
		{
			bill = this.getNoc() * 0.25 + 10;
		}
		return bill;
	}
	
  
  void setCname(String cname)
  {
    this.cname = cname;
  }
  void setPno(long pno)
  {
    this.pno = pno;
  }
   void setNoc(int noc)
  {
    this.noc = noc;
  }
   void setDoc(double doc)
  { if (doc<1)
    this.doc = 1;
    else 
		this.doc = doc; 
  }
  // getters
   
  String getCname()
  {
    return this.cname ;
  }
  long getPno()
  {
    return this.pno;
  }
  int getNoc()
  {
    return this.noc;
  }
  double getDoc()
  {
    return this.doc;
  }
   
}

class q5{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter cust. name");
	String cn = sc.next();
	System.out.println("Enter phone numbers");
	long p = sc.nextLong();
	System.out.println("Enter number of calls");
	int n  = sc.nextInt();
	System.out.println("Enter durartion of calls");
	double d = sc.nextDouble();
	bill b1 = new bill();
	b1.setCname(cn);
	b1.setDoc(d);
	b1.setNoc(n);
	b1.setPno(p);
	double bill_amt = b1.calculateBillAmount();
	System.out.println(b1.getCname() + "         durartion of calls: " + b1.getDoc() +"     " + "bill amount:" +bill_amt  );
  }
}