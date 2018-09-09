package guvi;
import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
    int number, originalNumber, remainder, result = 0;
    System.out.println("Enter a three digit integer: ");
    Scanner sc= new Scanner(System.in);
    number=sc.nextInt();
    originalNumber = number;
    while (originalNumber != 0)
      {
        remainder = originalNumber%10;
        result += remainder*remainder*remainder;
        originalNumber /= 10;
      }
    if(result == number)
        System.out.println("it is an Armstrong number.");
      else
        System.out.println("it is not an Armstrong number.");
	  }
	 }
