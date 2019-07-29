package GUVI_PLAYER;

import java.util.Arrays;
import java.util.Scanner;

public class SecSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		//int arr1[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int secmax=arr[n-k];
		System.out.println(secmax);

	}

}
