package GUVI;

import java.util.Scanner;

public class Lexicograher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.next();
		}
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i].compareTo(arr[j])>0){
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]);

		}
		
	}

}
