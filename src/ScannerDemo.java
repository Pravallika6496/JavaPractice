import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a string:"); //Hi good morning
		String st=ip.nextLine();
		System.out.println("Entered string is " +st); //Hi good morning
		
		System.out.println("Enter a number:"); //23
		int n=ip.nextInt();
		System.out.println("Entered string is " +n); //23
		
		System.out.println("Enter a string:"); //Hi good morning
		String str=ip.next();
		System.out.println("Entered string is " +str); //Hi
		
		ip.close();
	}

}
