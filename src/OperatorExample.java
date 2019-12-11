
public class OperatorExample {
	public static void main(String args[])
	{  
		int x=10;  
		System.out.println(x++); //10 (11)  
		System.out.println(++x); //12  
		System.out.println(x--); //12 (11)  
		System.out.println(--x); //10  
		
		System.out.println("------");
		int i=10;  
		int j=10;  
		System.out.println(i++ + ++i); //10+12=22  
		System.out.println(j++ + j++); //10+11=21  
		
		System.out.println("------");
		int a=10;  
		int b=-10;  
		boolean c=true;  
		boolean d=false;  
		System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
		System.out.println(!c);//false (opposite of boolean value)  
		System.out.println(!d);//true  
		
		System.out.println("------");
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		System.out.println(20<<2);//20*2^2=20*4=80  
		System.out.println(15<<4);//15*2^4=15*16=240  
		
		System.out.println("------");
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2 
		
		System.out.println("------");
		//The logical && operator doesn't check second condition if first condition is false. 
		//It checks second condition only if first one is true.
        //The bitwise & operator always checks both conditions whether first condition is true or false.
		int p=10;  
		int q=5;  
		int r=20;  
		System.out.println(p<q&&p++<r);//false && true = false  
		System.out.println(p);//10 because second condition is not checked  
		System.out.println(p<q&p++<r);//false && true = false  
		System.out.println(p);//11 because second condition is checked  
		
		System.out.println("------");
		int m=2;  
		int n=5;  
		int min=(m<n)?m:n;  
		System.out.println(min); //2
		
		System.out.println("------");
		int u=10;  
		int v=20;  
		u+=4;//u=u+4 (u=10+4)  
		v-=4;//v=v-4 (v=20-4)  
		System.out.println(u);  //14
		System.out.println(v);  //16
	}
}
