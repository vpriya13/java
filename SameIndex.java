package GUVI_PLAYER;

import java.util.Scanner;

public class SameIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(arr[i]==i){
				System.out.print(arr[i]+" ");
			}
		}

	}

}
