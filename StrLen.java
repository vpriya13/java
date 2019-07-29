package GUVI_PLAYER;

import java.util.Scanner;

public class Strlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=0){
				count++;
			}
		}
		System.out.println(count);

	}

}
