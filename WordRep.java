package GUVI_PLAYER;

import java.util.Scanner;

public class RepChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		String str=sc.nextLine();
		String s=sc.next();
		String arr[]=str.split(" ");
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i].equals(s)){
				count++;
			}
		}
		System.out.println(count);
	}

}
