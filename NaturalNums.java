package practice;
import java.util.Scanner;
public class NaturalNums {
public static void main (String[] args)
{
   int i, n, sum = 0;
   System.out.println("Enter n number \n");
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   for (i = 1; i <= n; i++)
   {
       sum = sum + i;
   }System.out.println(+sum);
}
}
