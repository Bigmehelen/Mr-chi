import java.util.Arrays;
import java.util.Scanner;
public class ArrayKataTest{
	
	public static void main(String[] args){

	Scanner sc= new Scanner(System.in);

	System.out.println("Enter a number");

	int[] scores = new int[3];
	for (int counter = 0; counter < scores.length; counter++) {
		int num = sc.nextInt();
		
		scores[counter] = num;
		
	}	

	for (int count = 0; count < scores.length; count++){
		System.out.print(scores[count]+ ", ");
	}

	System.out.print(Arrays.toString(ArrayKata.squareInArray(scores)));

}

}