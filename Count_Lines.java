import java.util.Scanner;
public class Main
{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    int count=0;
    String[] words=s1.split("\\.");
    for(String w:words){
    count++;
    }
    System.out.println(count);
   
   
  }
}
