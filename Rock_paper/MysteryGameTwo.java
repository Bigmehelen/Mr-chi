import java.util.Random;
import java.util.Scanner;
public class MysteryGameTwo{
public static void main(String [] args){

Random myRandom = new Random();
Scanner input = new Scanner (System.in);

int counter = 1;
int computerGuess = myRandom.nextInt(10)+1;
int total = 0;

while (counter > 0){
System.out.printf("Choose a number from 1 - 10 (Attempt %d) : ", counter);
int userGuess = input.nextInt();

if(userGuess == computerGuess){
System.out.printf("Congratulations, (Number of Attempt is %d ): ", counter);
break;
} else if (userGuess < computerGuess && counter > 0){
System.out.printf("Number is too low, computer guess is %d : ", computerGuess);
} else if(userGuess > computerGuess && counter > 0){
System.out.printf("Too High, computer guess is %d : ",computerGuess);

}
counter++;





}









}
}