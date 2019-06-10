package GUVI;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n/2;
		int flag=0;
		for(int i=2;i<=m;++i){
			if(n%i==0){
				System.out.println("no");
				flag=1;
				break;
			}
			 
		}
		if(flag==0){
			System.out.println("yes");
		}
			

		
	}

}
