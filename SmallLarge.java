
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int arr[]=new int[n];
	
	for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	}
	int small=arr[0],large=arr[0];
	for(int i=0;i<n;i++){
	    if(arr[i]<small){
	        small=arr[i];
	    }
	    if(arr[i]>large){
	        large=arr[i];
	    }
	}
	System.out.println(small);
	System.out.println(large);


	}
}
