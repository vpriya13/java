import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String str="";
		int dig=0;
	    while(num!=0){
	        
	        dig=num%10;
	        num=num/10;
	        str+=dig+" ";
	      
	    }
	    for(int i=str.length()-1;i>=0;i--){
	          System.out.print(str.charAt(i));
	    }
	    
	}
}
