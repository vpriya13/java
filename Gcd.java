package GUVI;
import java.util.*;
public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int gcd=1;
		int num=sc.nextInt();
		int num1=sc.nextInt();
		for(int i=1; i<=num && i<=num1; i++){
			if(num % i==0 && num1 % i==0){
				gcd=i;
			}
		}
		System.out.println(gcd);
	}

}
