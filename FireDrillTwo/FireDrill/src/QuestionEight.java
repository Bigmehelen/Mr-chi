import java.util.Scanner;

public class QuestionEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 Scores: ");
        int sum = 0;

        for(int count = 1; count <= 10; count++) {
            int scores = sc.nextInt();
            if(scores < 0 || scores >100) {
                System.out.println("Scores should be between 0 -100");
            }
            sum = sum + scores;
        }
        System.out.println("The sum is: " + sum);
    }
}
