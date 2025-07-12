import java.util.Scanner;
public class Max{
public static void main(String [] args){

Scanner input = new Scanner (System.in);

System.out.print("Input first number: ");
int first = input.nextInt();

System.out.print("Input second number: ");
int second = input.nextInt();

int prod = first * second;
int sum = first + second;
int average = (first + second) / 2;
double myDouble = average; 
int dist = first - second;
int max = first;
int min = first;

System.out.printf("%nThe product of two number is: %d", prod);
System.out.println();
System.out.printf("The sum of two number is: %d", sum);
System.out.println();
System.out.printf("The average of two number is: %.2f", myDouble);
System.out.println();

if (second > max){
max = second;
}
if (second < min){
min = second;
}

int diff = max - min;
System.out.printf("Distance of two integers: %d%n", diff);
System.out.printf("Max integer: %d%n", max); 
System.out.printf("Min integer: %d", min);



}
}