package GUVIHUNTER;

import java.util.Scanner;

public class Prg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s[]=str.split("\\s");
		String reverse="";
		for(int i=0;i<s.length;i++){
			StringBuffer sb=new StringBuffer(s[i]);
			sb.reverse();
			reverse+=sb.toString()+" ";
		}
		System.out.println(reverse);
		
	}

}
