package ChapterFiveExercise;

import java.util.Scanner;

public class SumOfTwoExtreme {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("How many numbers do you want to input: ");
       int numbers = input.nextInt();

       int smallest = Integer.MAX_VALUE;
       int largest = Integer.MIN_VALUE;

       for (int count = 1; count <= numbers; count++) {
           System.out.print("Enter the numbers " + count + ": ");
          int theNumber = input.nextInt();

           if (theNumber < smallest) {
               smallest = theNumber;
           }

           if (theNumber > largest) {
               largest = theNumber;
           }
       }
       int sum = largest + smallest;
       System.out.println("The smallest number is: " + smallest);
       System.out.println("The largest number is: " + largest);
       System.out.println("The sum of the max and min value is: " + sum);
   }
}
