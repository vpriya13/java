package GUVI_PLAYER;

import java.util.Scanner;

public class GreatestCommonDivisior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1 = sc.nextInt(), n2 =sc.nextInt(), gcd = 1;
        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            // Checks if i is factor of both integers
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }
        System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);
	}

}
