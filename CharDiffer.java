package GUVI_PLAYER;

import java.util.Scanner;

public class CheckCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		String s1="",s2="";
		int count=0;
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				count++;		
			}
		}
		if(count==0||count==1){
			System.out.println("yes");
		}
		else
			System.out.println("no");
	
	
		
	}

}
