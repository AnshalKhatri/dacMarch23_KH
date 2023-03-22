import java.util.* ;

class p2s2 { 
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

}
}
	