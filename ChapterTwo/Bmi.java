import java.util.Scanner;
public class Bmi{
public static void main(String [] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter weight in pounds: ");
double w = input.nextDouble();

System.out.println("Enter height in inches: ");
double h = input.nextDouble();

double pound = 0.45359237;
double inch = 0.0254 * 0.0254;

double weight = pound * w; 
double height = inch * h * h;
double bmi = weight / height;

System.out.printf("%s %f%n", "Enter weight in pound", weight);
System.out.printf("%s %f%n", "Enter height in inches", height);
System.out.printf("%s %f%n", "BMI is", bmi);

}
}