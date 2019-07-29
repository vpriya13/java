package GUVI_PLAYER;

import java.util.Scanner;

public class IsInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (n >=-2147483648 && n <=2147483647)
			System.out.println("int");
		else
			System.out.println("long");

	}

}
