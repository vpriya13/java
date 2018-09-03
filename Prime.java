package Ass2;
import java.util.*;
public class Prime {
	public static void main(String[] args) {
		int num,flag=0;
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
        for(int i = 2; i <= num/2; ++i)
        {  
            if(num % i == 0)
            {
                flag =1;
                break;
            }
        }
        if (flag==0)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
	}

