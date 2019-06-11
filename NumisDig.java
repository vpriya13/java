package GUVI;

import java.util.Scanner;

public class NumInStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(s.charAt(i))){
				System.out.print(s.charAt(i));
			}
		}
		

	}

}
