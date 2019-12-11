import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		int r,n,temp,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		n=s.nextInt();
		
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");
		s.close();
	}

}
