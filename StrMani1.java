import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the  numbers:");
    
    String str=sc.next();
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        if(i<=n){
            System.out.println(str);
        }
    }
    
  }
}
