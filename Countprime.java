package GUVI_PLAYER;

import java.util.Scanner;

public class CountPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int low=sc.nextInt();
		int high=sc.nextInt();
		int count=0;
		  while (low <= high) {
	            boolean flag = false;
	            count++;
	            for(int i = 2; i <= low/2; ++i) {
	                // condition for nonprime number
	                if(low % i == 0) {
	                    flag = true;
	                    count=count-1;;
	                    break;
	                }
	            }
	 
	            ++low;
	        }
		  System.out.println(count);
	}

}
