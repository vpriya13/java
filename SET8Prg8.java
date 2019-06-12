package GUVISET11;

import java.util.Scanner;

public class Prg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=1;i<n;i++){
			arr[i]=sc.nextInt();
			if(i==k){
				System.out.println(arr[i]);
			}
		}

	}

}
