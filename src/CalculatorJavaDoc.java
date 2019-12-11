
public class CalculatorJavaDoc {

	public static void main(String[] args) {
		/** The Calculator class provides methods to get addition and subtraction of given 2 numbers.*/  
		@SuppressWarnings("unused")
		class Calculator {  
		/** The add() method returns addition of given numbers.*/  
		public int add(int a, int b){return a+b;}  
		/** The sub() method returns subtraction of given numbers.*/  
		public int sub(int a, int b){return a-b;}  
		}  

	}

}
