package GUVI;
import java.util.Scanner;
public class Str1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String s="";
		int k=sc.nextInt();
		
		for(int i=0;i<str.length();i++){
			if(i<k){
				s=s+str.charAt(i);
			}
		}
		System.out.println(s);
	}

}
