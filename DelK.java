import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=k;j<n;j++){
            arr[j]=0;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
            
        }
        
     
    }
}
