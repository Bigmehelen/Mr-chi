import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 Scores: ");
        int sum = 0;
        double average = 0;
        int count;
        for(count = 1; count <= 10; count++) {
            int scores = sc.nextInt();
            sum = sum + scores;
        }
        average = sum / count;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }
}
