import java.util.* ;

class p17 { 
public static void main (String args[]){
//System.out.println("enter no. ") ; 
//Scanner sc = new Scanner(System.in); 
//int n = sc.nextInt();
int x = 1;
for (int i = 0 ; i<5 ; i++)
{	
	for (int j = 0 ; j<=i ; j++)   //lower triangular
	{
		System.out.print(x) ;
		System.out.print(' ') ;
		x++;
	}
	
	System.out.println() ;
}

}
}
	