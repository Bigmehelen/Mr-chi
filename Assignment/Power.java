import java.util.Scanner;
public class Power{
public static void main(String [] args ){

Scanner input = new Scanner(System.in);

double counter = 1;
double sqrt;

System.out.print("Enter first number: ");
double first = input.nextDouble();

System.out.print("Enter second number: ");
double second = input.nextDouble();

while (counter > 0){
sqrt = Math.pow(first,second);
int cast = (int) sqrt;
counter++;
System.out.printf("The value of number is %d", cast);
break;
}




}
}