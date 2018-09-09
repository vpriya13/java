package guvi;
import java.util.*;
public class ArmstrongInterval {
	public static void main(String[] args) {
		int low, high, i, temp1, temp2, remainder, n = 0, result = 0;
		System.out.println("Enter two numbers(intervals): ");
			Scanner sc = new Scanner(System.in);
			low =sc.nextInt();
			high =sc.nextInt();
			for(i = low + 1; i < high; ++i)
			{
				temp2 = i;
				temp1 = i;
				while (temp1 != 0)
				{
					temp1 /= 10;
					++n;
				}
				while (temp2 != 0)
				{
					remainder = temp2 % 10;
					result += Math.pow(remainder, n);
					temp2 /= 10;
				}
				if (result == i) {
					System.out.println(i);
				}
				n = 0;
				result = 0;

			}
	}
}
