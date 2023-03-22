import java.util.* ;

class p2 { 
public static void main (String args[]){
//System.out.println("enter no. ") ; 
//Scanner sc = new Scanner(System.in); 
//int n = sc.nextInt(); 
for (int i = 0 ; i<5 ; i++)
{
	for (int j = 0 ; j<=i ; j++)   //lower triangular
	{	
		char c = 'A' ; 
		char c1 = (char)(c + j) ;
		System.out.print(c1) ;
		
	}
	System.out.println() ;
}

}
}
	