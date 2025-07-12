import java.util.Scanner;
public class NameHighestScore{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

int highest = -2_000_000_000;
int count = 1;
String highestName = " ";


System.out.println("Enter no of Students :  ");
int numOfStudents = input.nextInt();


System.out.println("Enter Students name and Student Score ");
 String name = input.next();
int userInput = input.nextInt();


while(count < numOfStudents) {

 if(userInput > highest){
highest = userInput;
highestName = name;

System.out.print("Enter Student name and Student score: ");
name = input.next();
userInput = input.nextInt();

count++;

} 
}

System.out.printf("Student highest name %s and score %d", highestName, highest );









}
}