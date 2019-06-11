package GUVI;
import java.util.Scanner;
public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int mul=n*n1;
		int count=0;
		for(int i=0;i<mul;i++){
			if(i*i==mul){
				count=1;
			}
		}
		if(count==1){
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}

}
