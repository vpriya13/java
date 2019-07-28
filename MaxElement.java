package GUVI_PLAYER;

import java.util.Scanner;

public class Maxelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[k];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<k;j++){
			arr1[j]=sc.nextInt();
		}
		int nmax=arr[0];
		//System.out.println(nmax);
		for (int i = 0; i < arr.length; i++) 
            if (arr[i] >= nmax) 
                nmax = arr[i];
		
		int kmax=arr1[0];
		//System.out.println(kmax);
		for(int j=0;j<arr1.length;j++)			
			if(arr1[j]>=kmax)
				kmax=arr1[j];
			
		System.out.print(nmax+" "+kmax);

	}

}
