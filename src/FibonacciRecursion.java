
public class FibonacciRecursion {

	static int n1=0, n2=1, n3;
	static void printFibonacci(int count)
	{
		if(count>0)
		{
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		printFibonacci(count-1);
		}
	}
	public static void main(String[] args) {
		System.out.print(n1+" "+n2);
		int count=10;
		printFibonacci(count-2);
	}

}
