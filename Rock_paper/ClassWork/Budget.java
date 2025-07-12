import java.util.Scanner;
public class Budget{
public static void main (String [] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter costomer Budget");
double budget = sc.nextInt();

final double pricePerliter = 855;

double amountOfgallon = budget / pricePerliter;

System.out.printf("Number of liters costomer can buy is %.2f%n", pricePerliter);


}
}





