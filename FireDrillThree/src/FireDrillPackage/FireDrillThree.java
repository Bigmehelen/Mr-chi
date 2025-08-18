package FireDrillPackage;

import java.util.Arrays;

public class FireDrillThree {

    public static int[] taskOne(int[] array){
        return array;
    }

    public static void taskTwo(int[] array){
        System.out.println(Arrays.toString(array));
    }

    public void taskThree(int[] array){
        System.out.print(Arrays.toString(array));
    }

    public int[] taskFour(int[] array){
        int evenIndex = 0;
        for(int count = 0; count < array.length; count++) {
            if( count % 2 == 0) {
                evenIndex++;
            }
        }
        int[] newArray = new int[evenIndex++];
        int index = 0;
        for(int count = 0; count < array.length; count++) {
            if(count % 2 == 0) {
                newArray[index] = array[count];
                index++;
            }
        }
        return newArray;
    }

}
