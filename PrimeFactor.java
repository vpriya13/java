package GUVI_PLAYER;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int number;
		Set<Integer> s=new HashSet<>();
		for(int i=2;i<n;i++){
			if(n%i==0){
				s.add(i);
				n=n/i;
				i--;
			}
		}
		System.out.println(s.toString());

	}

}
