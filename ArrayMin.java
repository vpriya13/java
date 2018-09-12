import java.util.*
Public class ArrayMin{
public static void main(String args[]){
  int i=0,n=0;
  System.out.println("enter the limit of n:");
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  int a[]=new int[n];
    for(i=0;i<n;i++){
      a[i]=sc.nextInt();
}
      int min=0;
    for(i=0;i<n;i++){
      min=a[0];
      if(min>a[i]){
      min=a[i];
}
System.out.println("the minimum element is:);
System.out.println(min);
}
}
