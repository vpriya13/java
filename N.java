package practice;
import java.util.Scanner;
public class N {
	public static void main(String[] args) {
		    int sum=0;
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter the input:");
			int n=scan.nextInt();
			int k=scan.nextInt();
			int a[]=new int[n];
		    for(int i=0;i<a.length;i++)
		    {
		    	a[i]=scan.nextInt();
		    }
		    for(int i=0;i<k;i++)
		    {
		    	sum=sum+a[i];
		    }
		    System.out.println(""+sum);	
	}
}
