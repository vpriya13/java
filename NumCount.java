package guvi;
import java.util.Scanner;
public class NumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		char ch[]=n.toCharArray();
		int count=0;
		for(int i=0;i<n.length();i++) {
			if(ch[i]!=0) {
				count++;
			}
		}
		System.out.println(count);
		

	}

}
