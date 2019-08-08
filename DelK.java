import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
            if(arr[k+1]!=arr[i]){
                System.out.print(arr[i]+" ");
            }
            else
            break;
        }
        
     
    }
}
