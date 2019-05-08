public class Main{
  public static void main(String args[]){
    System.out.println("enter the 10 numbers:");
    int n=10;
    int a[]=new int[10];
    for(int i=0;i<10;i++){
        a[i]=sc.nextInt();
    }
    int max;
    max=a[0];
    for(int i=0;i<10;i++){
        if(max<a[i]){
            max=a[i];
        }
    }
    System.out.println(max);
    
  }
}
