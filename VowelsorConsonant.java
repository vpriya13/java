package practice;
import java.util.*;
public class VowelsorConsonant {
		    public static void main(String[] args) {

		    	int i=0;
		    	Scanner sc=new Scanner(System.in);
		    	System.out.println("Enter a character : ");
		    	char ch=sc.next( ).charAt(0);	 		
		    	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		    	{
		    	System.out.println("Entered character "+ch+" is  Vowel"); 
		    	}
		    	else if((ch>='a'&&ch<='z'))
		    		System.out.println(""+ch+" is Consonant");
		    	      else
		    		System.out.println("invalid ");		

	    }
	}

