import java.util.* ;

class p14s2 { 
public static void main (String args[]){
//System.out.println("enter no. ") ; 
//Scanner sc = new Scanner(System.in); 
//int n = sc.nextInt(); 
for (int i = 0 ; i<4 ; i++)
{
	for (int k = 1 ; k<=i ; k++)   //lower triangular
	{	
		
		System.out.print(" ") ;
		
	}
	for (int j = 4 ; j>=i ; j--)   //lower triangular
	{
		System.out.print("* ") ;
		
	}
	System.out.println() ;
}
for (int i = 0 ; i<5 ; i++)
{ 
	
	for (int j = 3 ; j>=i ; j--)   //lower triangular
	{
		System.out.print(" ") ;
		
	}
	
	for (int k =0 ; k<=i ; k++)   //lower triangular
	{	
		
		System.out.print("* ") ;
		
	}
	
	System.out.println() ;
}
}
}
	