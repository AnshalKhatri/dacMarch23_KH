import java.util.* ;

class p9s2 { 
public static void main (String args[]){
//System.out.println("enter no. ") ; 
//Scanner sc = new Scanner(System.in); 
//int n = sc.nextInt(); 
for (int i = 0 ; i<5 ; i++)
{
	for (int j = 0 ; j<5 ; j++)   //lower triangular
	{
		if ( j >= 4-i)
		System.out.print("*") ;
		else
		System.out.print(' ') ;	
	}
	System.out.println() ;
}
for (int i = 0 ; i<5 ; i++)
{
	for (int k = 1 ; k<=i ; k++)   
	{	
		
		System.out.print(' ') ;
	}
	for (int j = 4 ; j>=i ; j--)   
	{	
		
		System.out.print('*') ;
	}
	
	
	
	
	System.out.println() ;
}
}
}
	