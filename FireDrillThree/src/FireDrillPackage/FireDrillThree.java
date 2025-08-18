package FireDrillPackage;

import java.util.Arrays;

public class FireDrillThree {

    public static int[] TaskOne(int[] array){
        return array;
    }

    public static void TaskTwo(int[] array){
        System.out.println(Arrays.toString(array));
    }

    public static void TaskThree(int[] array){
        System.out.print(Arrays.toString(array));
    }

    public static int[] TaskFour(int[] array){
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
                newArray[count] = evenIndex[index];
            }
        }
        return newArray;
    }
    
}
