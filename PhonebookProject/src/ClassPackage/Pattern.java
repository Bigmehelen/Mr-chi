package ClassPackage;

import java.util.ArrayList;
import java.util.List;

public class Pattern {
    public static void printOccurrence(String word) {
        List<Character> arr = new ArrayList<>();
        for(int index = 0; index < word.length(); index++){
            int occurrence = 0;
            if(arr.contains(word.charAt(index)) || word.charAt(index) == ' ')continue;
            for(int counter = 0; counter < word.length(); counter++){
                if(word.charAt(index) == word.charAt(counter)){
                    occurrence++;
                }
            } arr.add(word.charAt(index));
            System.out.printf("%s: %d%n", word.charAt(index),occurrence);
            }
        }


        public static boolean isPalindrome(int number){
            String original = String.valueOf(number);
            String reversed = new StringBuilder(original).reverse().toString();
            return original.equals(reversed);
        }

        public static boolean checkPalindrome(int number){
            if(number < 0) return false;
            int original = number;
            int reversed = 0;

            while(number != 0){
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number = number / 10;
            }
            return original == reversed;
        }


    public static void main(String[] args) {
        String word ="my name is helen";
        printOccurrence(word);

        int number = 10;
        System.out.println(checkPalindrome(number));
    }

}


