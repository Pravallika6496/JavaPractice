
public class ReverseFibonacci {

	static int n1=0, n2=1, n3;
	static int count=10;
	public static int a[]=new int[count];
	
	static void printFibonacci(int count, int i)
	{
		if(count>0)
		{
		n3=n1+n2;
		a[i]=n3;
		n1=n2;
		n2=n3;
		printFibonacci(count-1, i+1);
		}
		
		for(int j=a.length;j>=0;j++)
			System.out.println(a[j]);
	}
	
	public static void main(String[] args) {
		//System.out.print(n1+" "+n2);
		int i=2;
		System.out.println("HI");
		
		a[0]=n1;
		a[1]=n2;
		printFibonacci(count-2, i);
	}
}
