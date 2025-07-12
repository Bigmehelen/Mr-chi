import java.util.Scanner;
public class Largest {
public static void main (String [] args){
Scanner input = new Scanner(System.in);
 
System.out.println("Enter first integer: ");
int first = input.nextInt();

System.out.println("Enter second integer: ");
int second = input.nextInt();

System.out.println("Enter third integer: ");
int third = input.nextInt();

System.out.println("Enter fourth integer: ");
int fourth = input.nextInt();

System.out.println("Enter fifth integer: ");
int fifth = input.nextInt();

int smallest = first;
int largest = first;

if (second < smallest){
    smallest = second;
}
if (second > largest) {
   largest = second;
}
if (third < smallest){
    smallest = third;
}
if (third > largest) {
    largest = third;
}
if (fourth < smallest){
    smallest = fourth;
}
if (fourth > largest) {
    largest = fourth;
}
if (fifth < smallest){
    smallest = fifth;
}
if ( fifth > largest) {
    largest = fifth;
}
   System.out.printf("%s %d%n", "the smallest integer is", smallest);
   System.out.printf("%s %d%n", "the largest integer is", largest);
}
}