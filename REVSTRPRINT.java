package GUVISET11;

import java.util.Scanner;

public class Prg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=sc.nextInt();
		int count = 0;
		String str = "";
		for(int i=s.length()-1;i>=0;i--){
			if(count==n) break;
//			System.out.print(s.charAt(i)+"");
			str = s.substring(i, i+1)+str;
			count++;
		}
		System.out.println(str);

	}

}
