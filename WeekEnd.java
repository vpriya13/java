package GUVI_PLAYER;

import java.util.Scanner;

public class WeekEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the day:");
		String string=sc.next();
		if(string.equalsIgnoreCase("Saturday")||string.equalsIgnoreCase("Sunday")){
			System.out.println("yes");
		}
		else
			System.out.println("no");

	}

}
