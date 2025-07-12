
import java.util.Scanner;
public class Circle{
public static void main (String [] args){
Scanner scanner = new Scanner(System.in);

System.out.println("The radius of the circle is: ");
double r = scanner.nextDouble();
double square = r * r;
double d = 2 * r;
double pi = 3.14159;
double c = 2 * pi * r;
double a = pi * square;


System.out.printf("%s %f%n", "the diameter is", d);
System.out.printf("%s %f%n", "the circumference is", c);
System.out.printf("%s %f%n", "the area is", a);

}
}