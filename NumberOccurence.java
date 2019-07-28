package GUVI_PLAYER;

import java.util.Scanner;

public class NumberOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		char k=sc.next().charAt(0);
		int count=0;		
		char arr[]=n.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]==k){
				count++;
			}
		}
		if(count==0){
			System.out.println(count);
		}
		else
			System.out.println(count);

	}

}
