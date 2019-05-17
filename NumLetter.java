package guvi;
import java.util.Scanner;

public class LetterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count=0,count1=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
		
			if(Character.isDigit(ch[i])) {
				count++;
				
			}
			if( Character.isLetter(ch[i])) {
				count1++;
			}
		}
		if(count==0) {
			System.out.println("no");
		}
		else {
			System.out.println("yes");
		}

	}

}
