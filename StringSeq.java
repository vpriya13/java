package GUVI_PLAYER;

import java.util.Scanner;

public class StringSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String substr=sc.next();				
		if(str.contains(substr)){
			System.out.println("yes");
			}				
		else
			System.out.println("no");
	}

}
