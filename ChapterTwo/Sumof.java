import java.util.Scanner;
public class Sumof{
public static void main (String [] args){

Scanner input = new Scanner (System.in);

System.out.print("Enter a number between 0 and 1000: ");
int n = input.nextInt();

if (n <= 1000 && n >= 0) {

int digit = n / 1000;
int d2 = n / 100 % 10;
int d3 = n / 10 % 10;
int d4 = n % 10;
int d5 = digit + d2 + d3 + d4 ;

System.out.printf("%n%s %d", "The sum of the digit is", d5);
}
}
}