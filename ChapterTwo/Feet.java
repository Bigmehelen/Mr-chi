import java.util.Scanner;
public class Feet{
public static void main (String [] args){

Scanner input = new Scanner (System.in);

System.out.println("Number in feet: ");
double num = input.nextDouble();

double foot = 0.305;
double value = foot * num;

System.out.printf("%s %f %n", "Enter a value for feet: ", num);
System.out.printf("%s %f %s%n","feet is", value, "in meters");
}
}