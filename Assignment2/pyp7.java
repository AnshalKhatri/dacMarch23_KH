import java.util.* ;

class pyp7 {  //inverted
public static void main (String args[]){
//System.out.println("enter no. ") ; 
//Scanner sc = new Scanner(System.in); 
//int n = sc.nextInt(); 
for (int i = 0 ; i<9 ; i++)
{
	for (int k1 =1 ; k1<=i ; k1++)
	{
		System.out.print(" ") ;
	}
	for (int j = 8 ; j>=i ; j--)   //lower triangular
	{	
		System.out.print(9-i+" ") ;
			
	}
	
	System.out.println() ;
}

}
}
	