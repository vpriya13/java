package practice;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
    int n = 0, reversedInteger = 0, remainder, originalInteger;
    System.out.println("Enter an integer: ");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    originalInteger = n;
    while( n!=0 )
    {
        remainder = n%10;
        reversedInteger = reversedInteger*10 + remainder;
        n /= 10;
    }
    if (originalInteger == reversedInteger)
        System.out.println("it is palindrome");
    else
        System.out.println("it is not Palindrome");
	}
}
