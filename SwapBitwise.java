import java.util.Scanner;
public class SwapBitwise{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the two numbers:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("after the swapping");
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println(a+" "+b);
  }
}
