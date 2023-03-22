import java.util.* ;

class hihp { 
public static void main (String args[]){
//System.out.println("enter no. ") ; 
//Scanner sc = new Scanner(System.in); 
//int n = sc.nextInt(); 
for (int i = 0 ; i<6 ; i++)
{
	for (int j = 5 ; j>=i ; j--)   //lower triangular
	{
		if ((i>=1)&&(i<=3)&&(j<=4)&&(j>i))    //(i<=3) cane be replced with n-2 in general case
		{System.out.print(" ") ;}
		else
		{System.out.print("*") ;}
		
	}
	System.out.println() ;
}

}
}
	