import java.util.Scanner;

public class FactorialRecursion 
{
	//static int fact=1;
	static int Factorial(int n)
	{
		if(n==0)
			return(1);
		else
		{
//			fact= n * Factorial(n-1);		
//			return(fact);
			return(n * Factorial(n-1));
		}
	}
	
	public static void main(String[] args) 
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		n=s.nextInt();
		System.out.println(Factorial(n));
		s.close();
	}

}
