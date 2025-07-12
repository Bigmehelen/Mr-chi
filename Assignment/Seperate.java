import java.util.Scanner;
public class Seperate {
public static void main (String [] args){

Scanner input = new Scanner (System.in);

System.out.println("type the five digit number: ");
int a = input.nextInt ();

if (a >= 10_000 && a <= 99_999){
 
int first = a / 10000;
int second = (a / 1000) % 10;
int third = (a / 100) % 10;
int fourth = (a / 10) % 10;
int fifth = a % 10 ;

System.out.printf("%d  %d  %d  %d  %d", first, second, third, fourth, fifth);
}







}
}