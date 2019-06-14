package GUVI_PLAYER;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String nstr="";
		for(int i=str.length()-1;i>=0;i--){
			nstr=nstr+str.charAt(i);
			
		}
		System.out.println(nstr);

	}

}
