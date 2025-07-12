public class SecondLargest{

	public static int check(int[] numbers){

		int largest = -2_000_000_000;
		int secondLargest = -2_000_000_000;
		int checker = 0;
		for(int count = 0; count < numbers.length; count++){
			
			if (numbers[count] > largest){
				largest = numbers[count];
			}
		}
		
		for(int counter = 0; counter < numbers.length; counter++){
	
				if (numbers[counter] < largest){
				secondLargest = numbers[counter];
				checker++;
			}	

		}
		return secondLargest;

	}

}
