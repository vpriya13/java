package GUVI;
import java.util.Scanner;
public class Middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char c[]=str.toCharArray();
		int mid=str.length()/2;
		if(mid%2==0){
		c[mid]='*';
		}
		
		
		else{
			c[mid]='*';
			c[mid-1]='*';
		}
		for(int i=0;i<str.length();i++){
			System.out.print(c[i]);
		}
	}

}
