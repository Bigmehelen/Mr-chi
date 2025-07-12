import java.util.Scanner;
//My Second Line of Code 
public class Welcome2 {
public static void main(String[] args){
System.out.printf("%s %s by %d%n", "Welcome to", "Lekki", 4);

Scanner input = new Scanner(System.in);

System.out.print(" Enter first integer: ");
int num1 = input.nextInt();

System.out.print("Enter second integer: ");
int num2 = input.nextInt();

int dad = num1 + num2;

System.out.printf("Sum is %d%n", dad);
System.out.printf("Sum is %d%n", (num1 + num2));

System.out.printf("%s%n%s", "This is a Java","Program" );




}
}

