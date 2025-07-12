
import java.util.Scanner;
public class Remainder{
public static void main (String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Input first number: ");
int first = input.nextInt();

System.out.print("Input second number: ");
int second = input.nextInt();

int largest = first;
int smallest = first;


if (second > largest){
largest = second;
System.out.printf("The largest number is %d%n", largest);
}

if (second < smallest){
smallest = second;
}

if (first == second){
System.out.println("0");
}else {
if ((first - second) % 6 == 0){
System.out.printf("The smallest number is %d%n", smallest);
}
}














}
}