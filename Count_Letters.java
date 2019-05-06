import java.util.Scanner;
public class Count
{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int count=0;
    char ch;
    for(int i=0;i<str.length();i++){
      ch=str.charAt(i);
      if(ch!=' '){
        count++;
      }
    }
    System.out.println(count);
  }
}
