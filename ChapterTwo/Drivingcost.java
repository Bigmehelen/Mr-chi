import java.util.Scanner;
public class Drivingcost{
public static void main(String [] args){

Scanner input = new Scanner (System.in);

System.out.print("Enter the driving distance: ");
double d = input.nextDouble();

System.out.print("Enter miles per galon: ");
double mpg = input.nextDouble();

System.out.print("Price per gallon: ");
double ppg = input.nextDouble();

double c = (d / mpg) * ppg;

System.out.printf("%s%.2f%n", "The cost of driving is:$", c);
}
}