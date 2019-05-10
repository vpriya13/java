import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sep=0;
		int dig=0;
	    while(num!=0){
	        
	        dig=num%10;
	        num=num/10;
	        sep+=dig;
	      
	    }
	   System.out.println(sep);
	    
	}
}
