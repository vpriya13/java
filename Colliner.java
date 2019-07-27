package GUVI_PLAYER;

import java.util.Scanner;

public class Colliner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int x2=sc.nextInt();
		int x3=sc.nextInt();
		int y1=sc.nextInt();
		int y2=sc.nextInt();
		int y3=sc.nextInt();
		
		  int a = x1 * (y2 - y3) +  
	                x2 * (y3 - y1) +  
	                x3 * (y1 - y2); 
	      
	        if (a == 0) 
	            System.out.println("Yes"); 
	        else
	            System.out.println("No"); 

	}

}
