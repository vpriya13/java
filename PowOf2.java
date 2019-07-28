package GUVI_PLAYER;

import java.util.Scanner;

public class PowOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if (number % 2 != 0) {
		      System.out.println("no");
		} 
		else {
			for (int i = 0; i <= number; i++) {
		        if (Math.pow(2, i) == number) 
		        	System.out.println("yes");
		      }
		}
		   
	}

}
