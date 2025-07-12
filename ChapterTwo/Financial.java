import java.util.Scanner;
public class Financial{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter balance: ");
int bal = input.nextInt();

System.out.print ("Enter annual interest rate: ");
double interestrate = input.nextDouble();

double interest = bal * (interestrate/1200);
System.out.printf("The interest for next month is %f", interest);

}
}