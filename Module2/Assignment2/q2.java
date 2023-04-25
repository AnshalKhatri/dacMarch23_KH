import java.util.*;

class bmi{
	double ht;
	double wt;
  bmi()
  {
	  ht =0.0; 
	  wt = 0.0 ;
  }
  
  void setHt(double ht)
  {
    this.ht = ht ;
  }
  
  void setWt(double wt)
  {
    this.wt = wt ;
  }
  
  double getHt()
  {
	  return this.ht;
  }
  
  double getWt()
  {
	  return this.wt;
  }
  double calculateBMI()
  {
	  double actual_bmi = (double) this.getWt() / ( this.getHt() * this.getHt()) ; 
	  return actual_bmi;
  }
  
}

class q2{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter height in m");
	double h = sc.nextDouble();
	System.out.println("Enter weight in kg");
	double w = sc.nextDouble();
	bmi b1 = new bmi();
	b1.setHt(h);
	b1.setWt(w);
	double bmi_act = b1.calculateBMI();
	System.out.println("BMI : " + bmi_act);
  }
}