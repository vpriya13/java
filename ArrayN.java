import java.util.*
Public class ArrayN{
public static void main(String args[]){
  int i=0,n=0;
  System.out.println("enter the limit of n:");
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  int a[]=new int[n];
    for(i=0;i<n;i++){
      a[i]=sc.nextInt();
}
System.out.println("the numbers are;" +a[i]);
    for(i=0;i<n;i++){
      max=a[0];
      if(max<a[i]){
      max=a[i];
}
System.out.println(max);
}
}
