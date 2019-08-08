import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        int num=arr[0],max=0,p=0;
        for(int i=0;i<n;i++)
        {
          count=0;
            for(int j=0;j<n;j++)   
            {
                if(arr[i]==arr[j])
                {
                count++;
                }
            }
            if(max<count)
            {
                max=count;
               // p=arr[i];
            }
        }
    System.out.println(max);
    }
}
