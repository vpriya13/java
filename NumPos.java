import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int m=0;
      for(int i=0;i<n;i++){
          if(k==arr[i]) m=i;
          
      }
      System.out.println("num " +(m+1));
      
    }
}
