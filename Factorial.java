package guvi;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		int i,fact=1;  
		int number;//It is the number to calculate factorial    
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		number =sc.nextInt();
		for(i=1;i<=number;i++){    
			fact=fact*i;    
		}    
		System.out.println("Factorial of "+number+" is: "+fact);    
	}  
		}  
