package guvi;
import java.util.Scanner;
public class Numsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int sum=0;
		
		
		
		for(int i=0;i<=n;i++) {
sum=sum+i;
			
		}
		System.out.println(sum);
	}

}
