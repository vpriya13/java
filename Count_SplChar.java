import java.util.Scanner;
public class Main
{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string:");
    String str=sc.next();
    int count=0;
    //char ch;
    for(int i=0;i<str.length();i++){
       char ch=str.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                count++;
            }
    }
    System.out.println(count);
   
  }
}
