public class Categorize{

	public static int [] evaluate(int[] number, int num){
		int check = 0;
		int multipleCount = 0;
		for(int count = 0; count < number.length; count++){
			if(number[count] % 5 == 0)
				multipleCount++;
		}

		int [] result = new int [multipleCount++];

		for(int counter = 0; counter < number.length; counter++){
			if(number[counter] % 5 == 0)
				result[check] = number[counter];
				check++;
		}
		if(multipleCount == 0) System.out.print("No divisible number found");
		
		return result;
	}

}
