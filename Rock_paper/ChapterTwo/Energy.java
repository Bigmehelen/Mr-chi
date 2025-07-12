import java.util.Scanner;
public class Energy{
public static void main(String [] args){

Scanner input = new Scanner (System.in);

System.out.println("Enter the amount of water: ");
double m = input.nextDouble();

System.out.println("Enter initial temperature: ");
double i = input.nextDouble();

System.out.println("Enter final temperature: ");
double f = input.nextDouble();

double temp = f - i;
double weight = m * temp;
double q = weight * 4184;

System.out.printf("%s %.2f%n", "The energy needed is", q );

}
}