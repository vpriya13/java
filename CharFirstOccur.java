package GUVI_PLAYER;

import java.util.Scanner;

public class CharFirstOcuur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char k=sc.next().charAt(0);
		int res=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==k){
				res=i;
				break;
			}
		}
		System.out.println(res);

	}

}
