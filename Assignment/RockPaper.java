import java.util.Scanner;
public class RockPaper{
public static void main (String [] args ){

Scanner input = new Scanner (System.in);

int computerGuess = 2;
int counter = 1;
int compWins = 0;
int userWins = 0 ;

while (counter > 0) {
System.out.print(" Choose a number Scissor (0), Rock (1), Paper (2): ");
int userGuess = input.nextInt();
System.out.print("The computer is ");
if (computerGuess == 0){ 
System.out.print("Scissor. ");
} else if (computerGuess == 1){
System.out.print ("Rock. ");
} else if (computerGuess == 2){
System.out.print ("paper. ");
}

if (userGuess == computerGuess){
System.out.print("it is a Draw");

} else if (userGuess == 0 && computerGuess == 2 || userGuess == 2 && computerGuess == 1 || userGuess == 0 && computerGuess == 1){
System.out.print("You Win");
userWins = userWins + 1;

} else {
System.out.print("You lose");
compWins = compWins + 1;

} if (userWin - compWins > 2) break;

counter++;


}

}
}