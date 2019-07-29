package GUVIHUNTER;
import java.util.*;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList l=new ArrayList();
		for (int i = 0; i < n; i++) {
			l.add(sc.nextInt());
		}
		for (int i = n-1; i>0; i--) {
			System.out.print(l.get(i)+"->");
			
		}		

	}

}
