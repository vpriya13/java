package GUVI_PLAYER;

import java.util.Scanner;

public class EvenFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			if(n%i==0){
				if(i%2==0){
					System.out.println(i);
				}
			}
		}

	}

}
