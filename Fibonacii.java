import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the  numbers:");
    int n=sc.nextInt();
    int t1=1;
    int t2=1;
    for(int i=1;i<=n;i++){
        System.out.print(t1+" ");
        int sum=t1+t2;
        t1=t2;
        t2=sum;
        
    }    
    
  }
}
