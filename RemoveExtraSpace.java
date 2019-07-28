package GUVI_PLAYER;

import java.util.Scanner;


public class TrimWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(str.replaceAll("\\s+"," "));

	}

}
