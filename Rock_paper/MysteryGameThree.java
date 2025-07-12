import java.util.Random;
import java.util.Scanner;
public class MysteryGameThree{
public static void main(String [] args){

Scanner input = new Scanner (System.in);
Random myRandom = new Random ();

int computerGuess = myRandom.nextInt(10)+1;
int counter = 1

while(counter > 0){
System.out.printf("Choose a number from 1 - 10 (Attempt %d) : ", counter);
int userGuess = input.nextInt();

if (userGuess == computerGuess){
System.out.print("Congratulations");
break;
} else if (userGuess < computerGuess && counter > 0){
System.out.print ("Number too low , computer guess is %d", computerGuess)
} else if (userGuess > computerGuess){
System.out.print("Number too high, computer guess is %d", computerGuess);
}else if (counter == 3){

}


}












}
}