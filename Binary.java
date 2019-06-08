package GUVI;
import java.util.Scanner;
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int count=0;
		for(int i=0;i<n.length();i++){
			if(n=="0"||n=="1"){
				count++;
			}
			
		}
		if(count==n.length()){
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}

}
