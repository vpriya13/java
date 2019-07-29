package GUVI_PLAYER;

import java.util.Scanner;

public class RepChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		String str=sc.next();
		String str1=sc.next();
		char a[]=str.toCharArray();
		char b[]=str1.toCharArray();
		int count=0;
		if(a.length==b.length){
			for(int i=0;i<a.length;i++){
				if(a[i]==b[i]){
					count++;
				}
			}
		}
		if(count!=0)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
