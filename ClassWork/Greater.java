import java.util.Scanner;
public class Greater{
public static void main (String [] args ){

Scanner input = new Scanner (System.in);

System.out.println("Enter first integer: ");
int first = input.nextInt();

System.out.println("Enter second integer: ");
int second = input.nextInt();

int diff = first - second;

if(first > second){
System.out.printf("The difference is %d", diff);
}





}
}