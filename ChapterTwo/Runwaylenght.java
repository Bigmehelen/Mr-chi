import java.util.Scanner;
public class Runwaylenght{
public static void main (String [] args){

Scanner input = new Scanner (System.in);

System.out.println("Enter velocity: ");
double v = input.nextDouble();

System.out.println("Enter acceleration: ");
double a = input.nextDouble();

double velocity = v * v;
double acceleration = 2 * a;
double lenght = velocity / acceleration;

System.out.printf("%s %f%f%n", "Enter speed and acceleration", velocity , acceleration);
System.out.printf("%s%f%n", "The minimum runway lenght of this airplane is: ", lenght);
}
}