package vmp11;
import java.util.Scanner;
public class Numeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String string = sc.next();
        boolean numeric = true;

        numeric = string.matches("-?\\d+(\\.\\d+)?");

        if(numeric)
            System.out.println(string + " is a number");
        else
            System.out.println(string + " is not a number");
    }
}
