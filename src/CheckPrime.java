import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		int count=0;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=a.nextInt();
			if(num <= 1)
			{
				System.out.println("Number is not prime");
			}
			else
			{
				for(int i=2;i<num/2;i++)					
				{
					if((num%i)==0)
					{
						count++;
						break;
					}
				}
				if(count==0)
					System.out.println("Number is prime");
				else
					System.out.println("Number is not prime");
			}		
		a.close();
	}
}
