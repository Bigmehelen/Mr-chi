import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
	
	public class TestCategorize{

		@Test
		public void thatCategorizeExists(){
			int[] arrays = {10};
			Categorize.evaluate(arrays);
		}

		@Test
		public void thatCategorizeCanReturnInputAsResult(){
			int[] arrays = {10, 15, 21, 31};
			int[] expected = {10, 15};
			int[] actual = Categorize.evaluate(arrays,5);
			
		assertArrayEquals(actual, expected);
		}

		@Test
		public void thatCategorizeDoesNotHaveADivissibleNumber(){
			int[] arrays = {21, 17, 23, 31};
			int[] expected = {};
			int[] actual = Categorize.evaluate(arrays);
			
		assertArrayEquals(actual, expected);
		}


		
	}