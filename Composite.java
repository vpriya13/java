package GUVI;
import java.util.Scanner;
public class Composite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=2;
		while(n>0){
			if(n%i==0)
				break;
			i++;
		}
		if(n==i){
			System.out.println("no");
		}
		else
			System.out.println("yes");
	}

}
