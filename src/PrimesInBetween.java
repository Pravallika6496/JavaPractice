import java.util.Scanner;

public class PrimesInBetween {
	static int n,i;
	static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		else
		{
			for(int i=2;i<= n/2; i++)
				if(n%i==0)
					return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int n1,n2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter starting number");
		n1=s.nextInt();
		System.out.println("Enter ending number");
		n2=s.nextInt();		
		for(i=n1;i<=n2;i++)
			if(isPrime(i))
				System.out.print(i+" ");
		s.close();
	}

}
