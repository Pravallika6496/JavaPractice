import java.util.Scanner;

public class CheckPrimeMethod {
	static int count=0,n,i;
	private static boolean isPrime(int n) {
		if(n<=1)
		{
			return false;
		}
		else
		{
			for(i=2;i<=n/2;i++)
				if(n%i==0)
					return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		n=s.nextInt();
		if(isPrime(n))
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
		s.close();
	}
}
