import java.util.Arrays;
public class ArrayOfSquare{

	public static int[] numbers(int[] number){
		int smallest = 0;
		int smallestIndex = 0;

		int [] squareNumber = new int [number.length];
		for(int count = 0; count < number.length; count++){

			smallest = number[count];
			smallestIndex = count;
				
			for( int counter = count; counter < number.length; counter++){
				if(smallest > number[counter]){
				smallest = number[counter];
				smallestIndex = counter;
				}

			}

				if(smallestIndex != count){
				number[smallestIndex] = number[count];
				number[count] = smallest;
				squareNumber[count] = number[count] * number[count];
				}			
		}

		return squareNumber;
	}

	public static void main (String [] args){
		int[] num = {9,2,7,0,5};

	System.out.print(Arrays.toString(ArrayOfSquare.numbers(num)));	

	}


}