public class MultiplicationFunction {
	
	public static void multiplicationTableOf(int number1, int number2){
		int product = 0;
		System.out.println(" ".repeat(8) + "Multiplication Table");
		System.out.print(" ".repeat(3));
		for(int i = 1; i <= number2; i++) {
			System.out.printf("%4d",i);
		}
		System.out.println();
		System.out.print(" ".repeat(number1*3) + "-".repeat(number2 * 4));
		System.out.println();
		for(int counter = 1; counter <= number2; counter++) {
			System.out.print(counter + " |");
			for(int count = 1; count <= number2; count++) {
				product = counter * count;
				System.out.printf("%4d",product);
			}
			System.out.println();
		}
	}
}

public class MultiplicationFunctionTest {
	public static void main(String[] args) {

		MultiplicationFunction.multiplicationTableOf(1,5);
	}
}