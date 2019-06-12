package GUVISET11;

import java.util.Scanner;

public class NPowK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double N=sc.nextInt();
		double K=sc.nextInt();
		int Result=(int) Math.pow(N, K);
		System.out.println(Result);
	}

}
