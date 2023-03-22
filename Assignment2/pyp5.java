import java.util.* ;

class pyp5 { 
public static void main (String args[]){
//System.out.println("enter no. ") ; 
//Scanner sc = new Scanner(System.in); 
//int n = sc.nextInt(); 
for (int i = 0 ; i<9 ; i++)
{
	for (int k1 =7 ; k1>=i ; k1--)
	{
		System.out.print(' ') ;
	}
	for (int j = 0 ; j<=i ; j++)   //lower triangular
	{	
		System.out.print(9-i+j) ;	
	}
	for (int j1 = 0 ; j1<i ; j1++)   //lower triangular
	{	
		System.out.print(8-j1) ;	
	}
	System.out.println() ;
}

}
}
	