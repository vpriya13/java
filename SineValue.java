package GUVI_PLAYER;

import java.util.Scanner;
import java.lang.Math;

public class SineValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=Math.toRadians(a);
		System.out.format("%.1f",Math.sin(b));

		

	}

}
