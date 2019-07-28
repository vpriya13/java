package GUVI_PLAYER;

import java.util.Scanner;

public class EncodingStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++){
			int ascii=(int)arr[i]+3;
			char c=(char)ascii;
			System.out.print(c);
		}

	}

}
