class Adder
{
	static int add(int a, int b) //If the method is declared as private the class MethodOverloading can't find this method
	{
		return a+b;
	}
	
	//Difference in return type alone is not permitted
	//static double add(int a,int b){return a+b;}  This method is a duplicate method of above one because the parameters are same
	static int add(int a,int b, int c)
	{
		return a+b+c;
	}
	static double add(double a, double b)
	{
		return a+b;
	}
}
class MaxNum
{

	public static int max(int i, int j) {
		return (i>j? i:j);
	}

	public static int max(int i, int j, int k) {
		return (max(max(i,j),k));
	}
	
}
public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println(Adder.add(2, 3));
		System.out.println(Adder.add(2, 3, 4));
		System.out.println(Adder.add(2.3, 3.5));
		
		System.out.println(MaxNum.max(3, 6));
		System.out.println(MaxNum.max(5, 9, 3));
	}

}
