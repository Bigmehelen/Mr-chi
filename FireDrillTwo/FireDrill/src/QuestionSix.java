import java.util.Scanner;

public class QuestionSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 Scores: ");
        int sumEven = 0;
        int evenCount = 0;
        double average = 0;
        for (int count = 1; count <= 10; count++) {
            int scores = sc.nextInt();
            if (scores % 2 == 0) {
                sumEven = sumEven + scores;
                evenCount = evenCount + 1;
            }
            average = sumEven / evenCount;
            System.out.println("The average is: " + average);
        }
    }
}
