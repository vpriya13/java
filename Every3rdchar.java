package GUVI_PLAYER;

import java.util.Scanner;

public class Str3rdChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		String str=sc.next();
		for(int i=0;i<str.length();i++){
			if(i%3==0){
				System.out.print(str.charAt(i));
			}
		}

	}

}
