package guvi;
import java.util.Scanner;
public class PrimeInterval {
	public static void main(String[] args) {
    int low, high, i, flag;
    System.out.println("Enter two numbers(intervals): ");
Scanner sc = new Scanner(System.in);
low=sc.nextInt();
high=sc.nextInt();
    while (low < high)
    {
        flag = 0;

        for(i = 2; i <= low/2; ++i)
        {
            if(low % i == 0)
            {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            System.out.println( low);

        ++low;
    }

}
}
