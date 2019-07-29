package GUVI_PLAYER;

import java.util.Scanner;

public class NDivisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<100;i++){
			if(n%i==0&&i<n){
				count=1;
			}
		}
		if(count>=1){
			System.out.println("yes");
		}
		else
			System.out.println("no");

	}

}
