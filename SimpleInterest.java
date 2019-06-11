package GUVI;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int t=sc.nextInt();
		int r=sc.nextInt();
		
		int simpleInterest=(p*t*r)/100;
		System.out.println(Math.floor(simpleInterest));
		

	}

}
