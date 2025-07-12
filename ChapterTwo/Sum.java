import java.util.Scanner;
public class Sum{
public static void main (String [] args){

Scanner input = new Scanner (System.in);

System.out.print("Enter a set of integer: ");
int a = input.nextInt();

System.out.print("Enter a set of integer: ");
int b = input.nextInt();

System.out.print("Enter a set of integer: ");
int c = input.nextInt();

 
int even = 0;
int odd = 0;

if (a % 2 == 0){
even = even + a;
}

if (a % 2 != 0){
odd = odd + a;
}

if (b % 2 == 0){
even = even + b;
}
if (b % 2 !=0){
odd = odd + b;
}
if (c % 2 == 0){
even = even + c;
}
if (c % 2 !=0){
odd = odd + c;
}

System.out.printf("%s %d%n","The sum of even", even);
System.out.printf("%s %d","The sum of odd", odd);
}
}