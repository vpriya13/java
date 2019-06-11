package GUVI;
import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		char choice=sc.next().charAt(0);
		switch(choice){
		case '/':
			System.out.println(n/n1);
			break;
		case '%':
			System.out.println(n%n1);
			break;
		}
	}

}

