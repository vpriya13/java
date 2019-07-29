package GUVI_PLAYER;

import java.util.Scanner;

public class RotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int k=sc.nextInt();
		String s=str.substring(k)+str.substring(0,k);
		System.out.println(s);
		

	}

}
