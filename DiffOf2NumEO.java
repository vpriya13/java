package GUVI;
import java.util.Scanner;
public class DiffOf2NumEO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int d=n-n1;
		if(d%2==0){
			System.out.println("even");
		}
		else
			System.out.println("odd");
	}

}
