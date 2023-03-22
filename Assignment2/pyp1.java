import java.util.* ;

class pyp1 { 
public static void main (String args[]){
//System.out.println("enter no. ") ; 
//Scanner sc = new Scanner(System.in); 
//int n = sc.nextInt(); 
for (int i = 0 ; i<9 ; i++)
{
	for (int k = 7 ; k>=i ; k--)   //lower triangular
	{
		System.out.print(' ') ;
	}
	for (int j =0; j<=i ; j++)
	{	
		System.out.print(i+1 + " ") ;
		//System.out.print(' ') ;
	}
	System.out.println() ;
}

}
}
	