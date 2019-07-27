package GUVI_PLAYER;

import java.util.Arrays;
import java.util.Scanner;

public class AppearTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int res=0,count=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count=1;
				}
				else{
					res = i;
				}
			}
		}
		System.out.println(arr[res]);

		

	}

}
