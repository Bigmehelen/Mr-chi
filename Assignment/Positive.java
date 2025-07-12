
import java.util.Scanner;
public class Positive{
public static void main (String [] args ){

Scanner input = new Scanner (System.in);

System.out.print("Input number: ");
int number = input.nextInt();

System.out.print("Input second number: ");
int number2 = input.nextInt();

int product = number * number2 ; 
int sum = number + number2 ;

if (number < 0 && number2 < 0 ){
System.out.printf("The product is %d", product);
}else {
if (number > 0 && number2 > 0){
System.out.printf("The product is %d", product);
}else{
System.out.printf("The sum is %d", sum);
}
}










}
}