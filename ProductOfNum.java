package GUVI;

import java.util.Scanner;

public class ProOfDIg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int product=1;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			product*=arr[i];
			
		}
		System.out.println(product);

	}

}
