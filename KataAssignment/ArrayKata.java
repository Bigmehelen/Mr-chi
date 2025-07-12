public class ArrayKata{
	
	public static int largest(int[] nums){
		
		int largest = -2_000_000_000;
		for(int count = 0; count < nums.length; count++){
		
			if(nums[count] > largest){
				largest = nums[count];
		
			}
		
		}
		return largest;
	}
		
	public static int sum(int[] numbers){
	
		int total = 0;

		for (int count = 0; count < numbers.length; count++){
			total = total + numbers[count];


	
	
		}
		return total;
	
	}


	public static int minimum(int[] numbers){
		int min = 2_000_000_000;
		
		for(int count = 0; count < numbers.length; count++){
			
			if(numbers[count] < min){
				min = numbers[count];
			}
		}
		
		return min;
	}

	public static int evenNumber(int[] numbers){
		int even = 0;
		for(int count = 0; count < numbers.length; count++){
			if(numbers[count] % 2 == 0){
				even = even + numbers[count];
			}
		}
		return even;
	}
	
	public static int oddNumbers(int[] numbers){
		int odd = 0;
		for(int count = 0; count < numbers.length; count++){
			if(numbers[count] % 2 != 0){
				odd = odd + numbers[count];
			}
		}
		return odd;
	}


	public static int[] maxAndMin(int[] numbers){
		int max = -2_000_000_000;
		int min = 2_000_000_000;

		for(int count = 0; count < numbers.length; count++){
			if(numbers[count] > max){
				max = numbers[count];
			}
			
			if(numbers[count] < min){
				min = numbers[count];
			}
			
		}

		int[] maxMin = new int[2];
		maxMin[0] = max;
		maxMin[1] = min;
		return maxMin;
			
		
	}

	public static int[] evenNumArray(int [] numbers){
		int even = 0;

		for(int count = 0; count < numbers.length; count++){
			if(numbers[count] % 2 == 0) even++;
		}
		int checker = 0;
		int[] evenCount = new int [even++];
		
		for(int counter = 0; counter < numbers.length; counter++){
			if(numbers[counter] % 2 == 0){
				evenCount[checker] = numbers[counter];
				checker++;
			}
		}
		return evenCount;

	}

	public static int[] arrayOfOdd(int[] numbers){
		int odd = 0;
		for(int count = 0; count < numbers.length; count++){
			if(numbers[count] % 2 != 0)odd++;
		}
		int check = 0;
		int[] oddCount = new int[odd++];
		
		for(int counter = 0; counter < numbers.length; counter++){
			if(numbers[counter] % 2 != 0){
				oddCount[check] = numbers[counter];
				check++;
			}
		}
		return oddCount;	
		
	}

	public static int noOfEven(int[] numbers){
	int even = 0;
	
		for(int count = 0; count < numbers.length; count++){
			if(numbers[count] % 2 == 0)even++;
		}

		return even++;
	}

	public static int[] squareInArray(int[] numbers){
		int square = 0;
		int[] squareNumber = new int [numbers.length];
		
		for( count = 0; count < numbers.length; count++){
			square = numbers[count] * number[count];
			squareNumber[count] = square
		}
		return squareNumber;
	}


}