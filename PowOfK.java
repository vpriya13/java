package GUVI_PLAYER;

import java.util.Scanner;

public class PowerOfK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int count=0;
		for(int i=1;i<n;i++){
			if(Math.pow(k, i)==n){
				count=1;
			}
		}
		if(count==1){
			System.out.println("yes");
		}
		else
			System.out.println("no");

	}

}
