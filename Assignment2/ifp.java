import java.util.* ;

class ifp { 
public static void main (String args[]){
//System.out.println("enter no. ") ; 
//Scanner sc = new Scanner(System.in); 
//int n = sc.nextInt(); 
for (int i = 0 ; i<6 ; i++)
{
	for (int j =0; j<=i ; j++)
	{	
		System.out.print(" ") ;
		//System.out.print(' ') ;
	}
	for (int k = 5 ; k>=i ; k--)   //lower triangular
	{
		System.out.print("* ") ;
	}
	
	System.out.println() ;
}

}
}
	