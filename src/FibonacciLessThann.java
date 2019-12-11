import java.util.Scanner;

public class FibonacciLessThann {
	
	static int n1=0, n2=1, n3;
	static void calculateFibonacci(int count, int n)
	{
		if(count>0)
		{
		n3=n1+n2;
		printFibonacci(n3, n);
		n1=n2;
		n2=n3;
		calculateFibonacci(count-1, n);
		}
	}
	
	static void printFibonacci(int a, int b)
	{
		if(a<b)
			System.out.print(a+" ");
		else
			System.exit(1);
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		s.close();
		printFibonacci(n1, n);
		printFibonacci(n2, n);
		int count=10;
		calculateFibonacci(count-2, n);
	}

}
