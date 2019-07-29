package GUVIHUNTER;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);		
		System.out.print("Enter the number:");
        int n=sc.nextInt(), sum = 1;
        int arr[]=new int[n];        
        for(int i=0;i<n;i++){
        	arr[i]=sc.nextInt();
        	sum=sum*arr[i];
        }

        System.out.println(sum);

	}

}
