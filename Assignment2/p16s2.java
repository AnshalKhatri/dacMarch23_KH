import java.util.* ;

class p16s2 { 
public static void main (String args[]){
//System.out.println("enter no. ") ; 
//Scanner sc = new Scanner(System.in); 
//int n = sc.nextInt(); 
for (int i = 0 ; i<5 ; i++)
{
	for(int k=4 ;k>=i; k--)
	{
		System.out.print(' ') ;	
	}
	for (int j = 0 ; j<=i ; j++)   //lower triangular
	{ 
		if ((i>=2)&&(i<=3)&&(j>=1)&&(j<i))    //(i<=3) cane be replced with n-2 in general case
		{System.out.print(" ") ;}
		else
		System.out.print("*") ;
	}
	System.out.println() ;
}

}
}
	