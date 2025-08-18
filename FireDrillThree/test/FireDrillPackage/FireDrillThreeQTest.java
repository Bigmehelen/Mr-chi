package FireDrillPackage;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FireDrillThreeQTest {
    @Test
    public void evenArrayTest(){
        FireDrillThree drill = new FireDrillThree();
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] expected = {1,3,5,7,9};
        assertEquals(Arrays.toString(expected), Arrays.toString(drill.taskFour(array)));
    }

}