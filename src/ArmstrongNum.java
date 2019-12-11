import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		int n, r, temp, sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		n=s.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=sum + (r*r*r);
			n= n/10;
		}
		if (temp==sum)
			System.out.println("Number is armstrong number");
		else
			System.out.println("Number is not armstrong number");
		s.close();
	}

}
