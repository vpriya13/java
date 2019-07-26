package GUVI_PLAYER;

import java.util.Scanner;

public class WordCamelcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] s=str.split(" ");
		char uc;
		for(int i=0;i<s.length;i++){
			uc=s[i].charAt(0);
			uc=Character.toUpperCase(uc);
			System.out.print(uc+s[i].substring(1,s[i].length())+" ");
		}
	}

}
