package GUVI;
import java.util.Scanner;
public class EvenPOddP {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
		String odd="";
		String even="";
		for(int i=1;i<n;i++){
			arr[i]=sc.next();
			if(i%2!=0){
				odd+=arr[i];
			}
			else
				even+=arr[i];
		}
		System.out.print(odd+" "+even);
	}

}
