package GUVI;
import java.util.Scanner;
public class NearestMul10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n%10;
		int a=(n/10)*10;
		int b=a+10;
		if(m==0){
			System.out.println(n);
		}
		else
			System.out.println((n-a>b-n)?a:b);
		
		
	}

}
