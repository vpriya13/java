package GUVI;
import java.util.Scanner;
public class StrPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a, b = "";
        System.out.print("Enter the string:");
        a = sc.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
	}

}
