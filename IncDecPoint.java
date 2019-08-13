import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      int k=arr[0];
      for(int i=0;i<n;i++){
          if(arr[i]>k){
              k=arr[i];
          }
      }
      System.out.println("num " +k);
    }
}
