import java.util.Scanner;
public class Futureinvest{
public static void main (String [] args){

Scanner input = new Scanner (System.in);

System.out.println("Enter investment amount: ");
double i = input.nextDouble();

System.out.println("Enter annual interest rate in percentage: ");
double a = input.nextDouble();

System.out.println("Enter number of year: ");
double n = input.nextDouble();

double mir = (a / 100) / 12 ;

double fiv = (1 + mir) ;
double fiv1 = Math.pow (fiv, n*12);
double fiv2 = i * fiv1 ;

System.out.printf("Future investment value is %.2f", fiv2);





}
}