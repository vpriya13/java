package GUVI;
import java.util.*;
public class Isogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		boolean count=false;
		str=str.toLowerCase();
		char arr[]=str.toCharArray();
		Arrays.sort(arr);
		for(int i=0;i<str.length()-1;i++){
			if(arr[i]==arr[i+1]){
				count= true;
			}
		}
		if(count==true){
			System.out.println("no");
		}
		else
			System.out.println("yes");

	}

}
