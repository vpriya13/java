import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        
        int min=arr[1]-arr[0];
        System.out.println(min);
       
    
      
      
    }
}
