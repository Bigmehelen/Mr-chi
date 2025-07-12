
import java.util.Scanner;
import java.util.Random;
public class Papergame{
public static void main (String [] args ){

Scanner input = new Scanner(System.in);
Random random1 = new Random();

System.out.print("Scissor (0), rock (1), paper(2): ");
int guess = input.nextInt();

int computerChoice = random1.nextInt(3);
System.out.print("The computer is. ");

if (computerChoice == 0){
System.out.print("Scissor.");
} else if (computerChoice == 1){
System.out.print("Rock");
} else if (computerChoice == 2) {
System.out.print("Paper");
} else {
System.out.print("invalid number");
}

//users choice

if(guess == 0){
System.out.print (" You are Scissor.");
} else if (guess == 1){
System.out.print(" You are rock.");
} else if (guess == 2){
System.out.print(" You are paper.");
} else {
System.out.print("Invalid number");
}

//winning condition
if (guess == computerChoice) {
System.out.print(" It is a draw");

}
else if ((guess == 0 && computerChoice == 2)||
         (guess == 1 && computerChoice == 0)||
         (guess == 2 && computerChoice == 1) 
        ){
System.out.println(" You won");
}else{
System.out.println(" You lose");

}

        

}
}