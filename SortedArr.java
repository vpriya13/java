package GUVI_PLAYER;

import java.util.Arrays;
import java.util.Scanner;

public class SortArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			arr1[i]=arr[i];
			
		}
		Arrays.sort(arr);
		for(int i=0;i<n;i++){
			if(arr[i]==arr1[i]){
				count++;
			}
		}
		if(count==n){
			System.out.println("yes");
		}
		else
			System.out.println("no");
		
		
	}

}
