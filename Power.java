package practice;
import java.util.Scanner;
public class Power {
	public static void main(String[] args) {
    int base, exponent, result;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a base number: ");
    base=sc.nextInt();
    System.out.println("Enter an exponent: ");
    exponent=sc.nextInt();
    // calculates the power
    System.out.println(Math.pow(base,exponent));
}
}
