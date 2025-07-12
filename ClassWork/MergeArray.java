import java.util.Arrays;
public class MergeArray{

	public static int[] numbers(int[] numOne, int[] numTwo){

		int[] result = new int[numOne.length + numTwo.length];

		for(int count = 0; count < numOne.length; count++){
			
			result[count] = numOne[count];
		}

			for(int index = 0; index < numTwo.length; index++){

				result[numOne.length + index] = numTwo[index];
			}
		return result;
	}

	public static void main (String []args){

		int[] num = {3, 4, 5};
		int[] num2 = { 1, 2, 3, 9, 7};

		System.out.print(Arrays.toString(numbers(num , num2)));


	}


}