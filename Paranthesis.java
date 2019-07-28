package TCS;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Prg3
{ 
  public static void main (String[] args) {
  //code
  Scanner scan=new Scanner(System.in);
  int t=scan.nextInt();
  for(int i=0;i<t;i++){
     String s=scan.nextLine();
     s=scan.nextLine();
     int a=0,b=0,c=0;
     for(int j=0;j<s.length();j++){
         if(s.charAt(j)=='{')a++;
         if(s.charAt(j)=='}')a--;
         if(s.charAt(j)=='[')b++;
         if(s.charAt(j)==']')b--;
         if(s.charAt(j)=='(')c++;
         if(s.charAt(j)==')')c--;
     }
     if(a==0 && b==0 && c==0)System.out.println("yes");
     else System.out.println("no");
  	}
  }


}
