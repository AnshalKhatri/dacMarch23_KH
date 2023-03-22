import java.util.* ;

class fp { 
public static void main (String args[]){
//System.out.println("enter no. ") ; 
//Scanner sc = new Scanner(System.in); 
//int n = sc.nextInt(); 
for (int i = 0 ; i<6 ; i++)
{
	for (int k = 4 ; k>=i ; k--)   //lower triangular
	{
		System.out.print(' ') ;
	}
	for (int j =0; j<=i ; j++)
	{	
		System.out.print("* ") ;
		//System.out.print(' ') ;
	}
	System.out.println() ;
}

}
}
	