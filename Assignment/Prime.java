import java.util.Scanner;
public class Prime{
public static void main (String [] args ){

Scanner input = new Scanner (System.in);

System.out.print("Input a number: ");
int num = input.nextInt();

boolean isPrime = true;
int counter = 1;

if (num <= 1){
isPrime = false;
} else  {
while (counter <= num / 2){
if (num % 2 == 0){
isPrime = false;
break;
}
counter++;
}
}

if (isPrime) {
System.out.print("The number is a Prime number");
} else{
System.out.print("The number is not a prime number");
}



}
}