package guvi;
import java.util.Scanner;
public class NumExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc=new Scanner(System.in);
				int N=sc.nextInt();
				int K=sc.nextInt();
				int arr[]=new int[N];
				int count=0;
				for(int i=0;i<N;i++) {
					arr[i]=sc.nextInt();
				}
				for(int i=0;i<N;i++) {
					if(arr[i]==K) {
						count++;
					}
				}
				if(count!=0)
				System.out.println("yes");
				else
					System.out.println("no");

			}

		}

