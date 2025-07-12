import java.util.Scanner;
public class Product{
public static void main(String [] args){

Scanner input = new Scanner (System.in);

System.out.println("Input first number: ");
int first = input.nextInt();

System.out.println("Input second number: ");
int second = input.nextInt();

int prod = first * second;

System.out.printf("The product of two number is: %d", prod);


}
}