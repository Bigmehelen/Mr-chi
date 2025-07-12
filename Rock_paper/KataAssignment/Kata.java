public class Kata{

public static boolean even (int num){
if (num % 2 == 0)
return true;
else 
return false;

}

public static boolean prime(int num){

int primeCheck = 0;
int primeCount = 0;

for (int i = num; i <= num; i++){

	 for(primeCheck = 1; primeCheck <= num; primeCheck++){

	if(i % primeCheck == 0)
	primeCount++;
	}

}
if (primeCount == 2){
return true;
}
else return false;
}

public static int subtract (int num1 , int num2){
int absoluteNum = 0;
int total = num1 - num2;
if (total < 0){
  absoluteNum = - total;
}

return absoluteNum;

}

public static float divide (float num1 , float num2){
int cast;
float total = num1 / num2;
return total;
}

public static boolean sqrt(double num){
double number = Math.sqrt(num);
if(number == (int)number)
	return true;
else
	return false;
}

/*public static boolean palindrome (int num)
int reverse = 0;
int remainder = 0;
int oldNum = num;

if(num < 10_000 || num > 99_999){
System.out.print("invalid input")'
}*/

public static boolean isFactorial(double num){
double factorial = 1;
double count = 1;

while(count <= num){
factorial = factorial * count;
count++;
}
 if (factorial == (int) factorial)
return true;
else
return false;
}

public static double square (double num){
double number = Math.pow (num, 2);
return number;
}




}