import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TestDriller{
	
	public static long totalCost(int noOfCopies){
	
	long pricePerCopy = 0;
	
		if(noOfCopies >= 1 && noOfCopies <= 4){
			pricePerCopy = 2000 * noOfCopies;
		}
		else if(noOfCopies >=5 && noOfCopies <= 9){
			pricePerCopy = 1800 * noOfCopies;
		}
		else if(noOfCopies >=10 && noOfCopies <= 29){
			pricePerCopy = 1600 * noOfCopies;
		}
		else if(noOfCopies >= 30 && noOfCopies <= 49){
			pricePerCopy = 1500 * noOfCopies;
		}
		else if(noOfCopies >= 50 && noOfCopies<= 99){
			pricePerCopy = 1300 * noOfCopies;
		}
		else if(noOfCopies >= 100 && noOfCopies<= 199){
			pricePerCopy = 1200 * noOfCopies;
		}
		else if(noOfCopies >= 200 && noOfCopies<= 499){
			pricePerCopy = 1100 * noOfCopies;
		}
		else if(noOfCopies >= 500){
			pricePerCopy = 1000 * noOfCopies;
		}
		return pricePerCopy;
	
	}

}


public class TestDrillerTest {
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.print("""
			
			TestDriller UTME

		   1-4 copies: 2000 per copy

		   5-9 copies: 1800 per copy

		   10-29 copies: 1600 per copy

		   30-49 copies: 1500 per copy

		   50-99 copies: 1300 per copy

		   100-199 copies: 1200 per copy

		   200-499 copies: 1100 per copy

		   500-above copies: 1000 per copy

		""");
		
		int noOfCopies = sc.nextInt();
		long totalCost = TestDriller.totalCost(noOfCopies);
		NumberFormat number = NumberFormat.getNumberInstance(Locale.US);
		String formattedAmount = number.format(totalCost);
		System.out.println("Total Cost is: "+ formattedAmount);



	}
}