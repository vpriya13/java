package GUVI_PLAYER;

import java.util.Scanner;

public class CountSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int count=0;
		//int arr[]=new int[n];
		for(int i=n;i<=k;i++){
			  for (int j = 1; j * j <= i; j++) 
	                if (j * j == i) 
	                    count++; 
			  
		}
		System.out.println(count);

	}

}
