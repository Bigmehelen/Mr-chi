import java.util.Random;
import java.util.Scanner;
public class MysteryGame{
public static void main (String [] args ){

Scanner input = new Scanner (System.in);

int computerGuess = input.nextInt(10);
int counter = 1;


while (counter < 4){

System.out.printf("Choose a Number (Attempt %d): ", counter);
int userGuess = input.nextInt();


if (userGuess == computerGuess){
System.out.printf("Congratulations, computers guess was %d ", computerGuess);
break;
} else if (counter == 3){
System.out.printf("Game Over , computers guess was %d ", computerGuess );
}else if (userGuess < computerGuess) { 
System.out.println("Too low, try again");
}else if (userGuess > computerGuess ) {
System.out.println("Too High, try again");

}

counter ++;



}
}
}