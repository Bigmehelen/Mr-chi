import java.util.Scanner;
public class Triangle{
public static void main (String [] args){

Scanner input = new Scanner (System.in);

System.out.println("Enter first point of triangle: ");
double x1 = input.nextDouble();
double y1 = input.nextDouble();

System.out.println("Enter second point of triangle: ");
double x2 = input.nextDouble();
double y2 = input.nextDouble();

System.out.println("Enter third point of triangle: ");
double x3 = input.nextDouble();
double y3 = input.nextDouble();

double s1 = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
double sqr1 = Math.sqrt (s1);

double s2 = (x3 - x2)*(x3 - x2) + (y3 - y2)*(y3 - y2);
double sqr2 = Math.sqrt(s2);

double s3 = (x3 - x1)*(x3 - x1) + (y3 - y1)*(y3 - y1);
double sqr3 = Math.sqrt(s3);

double s = (sqr1 + sqr2 + sqr3)/2;

System.out.printf("The value of s is %.2f%n%n", s);

double a = s*(s-sqr1)*(s-sqr2)*(s-sqr3);
double area = Math.sqrt(a);
System.out.printf("The area of the triangle is %.2f", area);


}
}