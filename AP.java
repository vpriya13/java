package GUVI;

import java.util.Scanner;

public class AP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a, d, n;
	    int sum = 0;
	    a=sc.nextInt();
	    d=sc.nextInt();
	    n=sc.nextInt();
	    sum = (n * (2 * a + (n - 1)* d ))/ 2;
        System.out.println(+sum);


	}

}
