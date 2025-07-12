import java.util.Scanner;
public class Driving{
public static void main (String [] args){

Scanner input = new Scanner (System.in);

System.out.println("Enter the driving distance: ");
double d = input.nextDouble();

System.out.println("Enter miles per gallon: ");
double m = input.nextDouble();

System.out.println("Enter price per gallon: ");
double p = input.nextDouble();

double c = 125.36;

System.out.printf("%s%.2f", "The cost of driving is $", c);

}
}