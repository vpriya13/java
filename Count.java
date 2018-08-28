package practice;
import java.util.*;
public class Count {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("entert the number");
				Scanner sc=new Scanner(System.in);
				int num=sc.nextInt();
		        int count = 0;
		        while(num != 0)
		        {
		            // num = num/10
		            num /= 10;
		            ++count;
		        }
		        System.out.println("Number of digits: " + count);
		    }
}
