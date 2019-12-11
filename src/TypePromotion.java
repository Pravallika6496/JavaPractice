class Adders
{
	static double add(double a, double b)
	{
		return a+b;
	}
}
public class TypePromotion {

	public static void main(String[] args) {
		System.out.println(Adders.add(2, 3)); //This method calls the add method with type double return
		//So the type of numbers is promote from int to float, as the method in adders class accepts float as parameters
	}

}
