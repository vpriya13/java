package GUVI_PLAYER;

import java.util.Scanner;

public class RepChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int a[]=new int[n];
		int k=sc.nextInt();
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		int res=0;
		
			for(int i=0;i<a.length;i++){
				if(a[i]<k){
					System.out.print(a[i]+" ");
				}
			}
		
		
	}

}
