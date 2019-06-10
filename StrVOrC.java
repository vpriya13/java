package GUVI;
import java.util.*;
public class VowelsOrCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
    	Scanner sc=new Scanner(System.in);
    	String str=sc.nextLine();
    	char ch;
    	for(int i=0;i<str.length();i++){	
    		ch=str.charAt(i);
    		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    		{
    			count++;
    		}
    	
    	}
    	if(count!=0)
    		System.out.println("yes"); 
    	else
    		System.out.println("no");
    		
	}
}
