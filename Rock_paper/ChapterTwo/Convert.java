import java.util.Scanner;
public class Convert{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a number in pound: ");
double num = input.nextDouble();

double pound = 0.454 * num;
System.out.printf("%s %f %s","pound is", pound,"kilogram");

}
}