import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        int arr[]=new int[n+m];
        for(int i=0;i<n;i++){
          arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
          arr2[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
          arr[i]=arr1[i];
        }
         
        for(int i=0,j=n;i<m;i++,j++){
           
          arr[j]=arr2[i];
         
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
        }
    
      
      
    }
}
