import java.util.Scanner;
import java.util.Random;
public class Head{
public static void main(String [] args ){

Scanner input = new Scanner (System.in);
Random random1 = new Random();

System.out.print("Head (0), tail (1): ");
int guess = input.nextInt();

int computerChoice = random1.nextInt(2);

System.out.print(" The computerChoice is: ");
if (computerChoice == 0){
System.out.print(" Head");
} else if (computerChoice == 1){
System.out.print(" Tail");
} else {
System.out.print(" Invalid number");
}

if (guess == 0){
System.out.print("You are head");
}else if (guess == 1){
System.out.print(" You are tail");
} else {
System.out.print(" Invalid number");
}

if (guess == computerChoice){
System.out.print(" You are correct");
} else {
System.out.print(" You are incorrect");
}




}
}