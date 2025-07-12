
import java.util.Scanner;
public class Velocity{
public static void main(String [] args ){

Scanner input = new Scanner(System.in);

System.out.println ("Enter first velocity:");
double v1 = input.nextDouble ();

System.out.println ("Enter second velocity:");
double v2 = input.nextDouble ();

System.out.println ("Enter the time: ");
double t = input.nextDouble ();

double velocity = v2 - v1;
double acceleration = velocity / t;

System.out.printf("%s %f %f %f %n", "Enter v1 v2 and t", v1, v2, t );
System.out.printf("%s %f%n", "The average Acceleration is", acceleration);
}
}