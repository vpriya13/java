package practice;
import java.util.Scanner;
public class NumbersRange {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num,m,n;
	    System.out.println("enter the intervals m and n value:");
	    m=sc.nextInt();
	    n=sc.nextInt();
	    System.out.println("Print Odd Numbers in a given range m to n:\n");
	    for (num = m; num <= n; num++)
        {
               if (num % 2 == 1)
                  System.out.println(num);

         }
}
}
