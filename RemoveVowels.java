package GUVI_PLAYER;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String string=sc.next();
		String snew;
		System.out.println("Input String : "+string);
		snew = string.replaceAll("[AaEeIiOoUu]", "");
		System.out.println(string);
		String snew1="";
		for(int i=snew.length()-1;i>=0;i--){
			snew1=snew1+snew.charAt(i);
			
		}
		System.out.println(snew1);


	}

}
