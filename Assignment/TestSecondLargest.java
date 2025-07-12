import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSecondLargest{

	@Test
	public void thatSecondLargestExists(){
		int[] numbers = {10};
		SecondLargest.check(numbers);
	}

	@Test
	public void thatSecondLargestCanReturnTheSecondLargestNumbers(){
		int[] numbers = {9,6,8,11,12};
		int expected = {11};
		int actual = SecondLargest.check(numbers);
		assertEquals(expected,actual);
	}



}