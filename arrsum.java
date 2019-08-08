import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int sum=0,res=0,r=0;
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
          sum+=arr[i];
      }
      while(sum>0){
              r=sum%10;
              res+=r;
              sum=sum/10;
          }
      if(sum==k||res==k)
      System.out.println("yes");
      else
      System.out.println("no");
    }
}
