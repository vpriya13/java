
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int s1=str1.length();
		int s2=str2.length();
		if(s1==s2){
		System.out.println(str1);
		}
		else if(s1<s2){
		    System.out.println(str2);
		}
		else{
		System.out.println(str1);
		}
		
	}
}
