import java.util.Scanner;

public class ExtractDigit{

	public static int extract(int number){
		int sumNumber = 0;
		int newNumber = 0;
		while(number != 0){
		newNumber = number % 10;
		sumNumber = sumNumber + newNumber;
		number = number / 10;

		}
		return sumNumber;

	}

}

public class ExtractDigitTest{

	public static void main (String [] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter numbers: ");
		int numbers = sc.nextInt();

		ExtractDigit.extract(numbers);

	}


}