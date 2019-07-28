package GUVI_PLAYER;

import java.util.Scanner;

public class SmallestDIvNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int lcm = (a > b) ? a : b;
	    while(true){
	    	if (lcm % a == 0 && lcm % b == 0) {
	              break;
	        }
	            lcm++;
	    }
	    System.out.println(lcm);
	    

	}

}
