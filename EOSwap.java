package GUVI_PLAYER;

import java.util.Scanner;

public class EOSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char str[]=new char[n];
		char tmp=' ';
		for(int i=0;i<n;i++){
			str[i]=sc.next().charAt(0);
		}
		for(int i=0;i<str.length;i=i+2){
		     tmp = str[i];
		     str[i] = str[i+1];
		     str[i+1] = tmp;
		     }
		System.out.println(str);

	}

}
