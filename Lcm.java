package GUVI;

import java.util.Scanner;

public class Lcm {

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
		int lcm=num*num1/gcd;
		System.out.println(lcm);

	}

}
