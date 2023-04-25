import java.util.*;

class book{
	String title;
	String author;
	String publ;
	String isbn;
	int year;
    double price; 
	int qty ; 
	
	book()
	{
		title = null ; 
		author = null ; 
		publ = null; 
		isbn = null; 
		year =0 ;
		price = 0.0 ; 
		qty = 0 ; 
	}
	void increaseQuantity(int qty , int x )
	{
		this.qty = this.qty+x;
	}
	
	void decreaseQuantity(int qty , int y)
	{
	if ((this.qty - y)< 0)
		{System.out.println("not enough books");}
	else 
		{this.qty = this.qty - y; }
	}
	
  
  void setTitle(String title)
  {
    this.title = title;
  }
  void setAuthor(String author)
  {
    this.author = author;
  }
  void setPubl(String publ)
  {
    this.publ = publ;
  }
  void setIsbn(String isbn)
  {
    this.isbn = isbn;
  }
   void setYear(int year)
  {
    this.year = year;
  }
   void setPrice(double price)
  {
    this.price = price;
  }
   void setQty(int qty)
  {
    this.qty = qty;
  }
  
  // getters
   
  String getTitle()
  {
    return this.title ;
  }
  String getAuthor()
  {
    return this.author;
  }
  String getPubl()
  {
    return this.publ ;
  }
  String getIsbn()
  {
    return this.isbn;
  }
   int getYear()
  {
    return this.year ;
  }
   double getPrice()
  {
    return this.price;
  }
   int getQty()
  {
    return this.qty;
  }
  void getInventoryValue()
  {
	  double val = (double)this.getPrice() * this.getQty();
	  System.out.println("total value of books" + val );
  }
  
}

class q3{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter title");
	String t = sc.next();
	System.out.println("Enter author");
	String a = sc.next();
	System.out.println("Enter publ");
	String p = sc.next();
	System.out.println("Enter ISBN");
	String i = sc.next();
	System.out.println("Enter year");
	int y = sc.nextInt();
	System.out.println("Enter price");
	double pr = sc.nextDouble();
	System.out.println("Enter qty");
	int q = sc.nextInt();
	book b1 = new book();
	b1.setTitle(t);
	b1.setAuthor(a);
	b1.setPubl(p);
	b1.setIsbn(i);
	b1.setYear(y);
	b1.setPrice(pr);
	b1.setQty(q);
	b1.getInventoryValue();
	
  }
}