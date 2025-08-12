import java.util.Scanner;

public class QuestionSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 Scores: ");
        int sum = 0;
        int evenCount = 0;
        double average = 0;
        for (int count = 1; count <= 10; count++) {
            int scores = sc.nextInt();
            if (scores % 2 == 0) {
                sum = sum + scores;
                evenCount = evenCount + 1;
            }
            if (average > 0) {
                average = average / evenCount;
            }
            System.out.println("The sum is: " + sum);
            System.out.println("The average is: " + average);
        }
    }
}
