package practice;
import java.util.*;
public class EvenRange {
	public static void main(String[] args) {
           int m,n,rem,i;
           System.out.println("Enter the first num :   \n");
           Scanner sc=new Scanner(System.in);
           m=sc.nextInt();
           System.out.println("Enter the last num :   \n");
           n=sc.nextInt();
           for(i=m; i<=n; ++i){
               rem = i % 2;
               if(rem == 0)
            	   System.out.println(i);
           }
	}
}
