import java.util.Scanner;

public class CheckPrimeMultiple {

	static int n,i;
	static int ch;
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
		while(n>=0)
		{
			if(isPrime(n))
				System.out.println("Number is prime");
			else
				System.out.println("Number is not prime");
			System.out.println("Want to exit: (1(Yes)/(0)No)");
			ch=s.nextInt();
			if(ch==1)
				System.exit(1);
			else
			{				
				System.out.println("Enter another number");
				n=s.nextInt();
			}
	}
		s.close();
}
}
