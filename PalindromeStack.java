package GUVIHUNTER;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class PaliStack {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		checkPalindromeUsingStack();
	}
 
	public static void checkPalindromeUsingStack() {
		String stringToCheck = sc.next();
		String palindromeString = "";
		
        Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < stringToCheck.length(); i++) {
			char character = stringToCheck.charAt(i);
			stack.push(character);
		}
		while (!stack.isEmpty()) {
			palindromeString = palindromeString + stack.pop();
		}
		if (stringToCheck.equals(palindromeString)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
