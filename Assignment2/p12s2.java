import java.util.* ;

class p12s2 { 
public static void main (String args[]){
//System.out.println("enter no. ") ; 
//Scanner sc = new Scanner(System.in); 
//int n = sc.nextInt(); 
for (int i = 0 ; i<5 ; i++)
{
	for (int j = 4 ; j>=i ; j--)   //lower triangular
	{
		System.out.print('*') ;
		
	}
	System.out.println() ;
}

for (int i = 0 ; i<5 ; i++)
{
	for (int j = 0 ; j<=i ; j++)   //lower triangular
	{	
		
		System.out.print("*") ;
		
	}
	System.out.println() ;
}


	
}
}
	