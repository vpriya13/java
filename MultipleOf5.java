package guvi;
import java.util.Scanner;
public class MultipleOf5 {
	public static void main(String[] args) {
  int sum=0,i,n;
        System.out.println("\n Please Give The Value of N:  ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        	for(i=1;i<=n;i++)
        {
            System.out.println(5*i);
        }
	}

}
