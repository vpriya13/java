package GUVI;
import java.util.Scanner;
public class MulOf13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%13==0){
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}

}
