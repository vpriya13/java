import java.util.*;
public class MyClass {
    public static boolean isPangram(String test){
        for (char a = 'A'; a <= 'Z'; a++)
            if ((test.indexOf(a) < 0) && (test.indexOf((char)(a + 32)) < 0))
                return false;
        return true;
    }
 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isPangram(s));
        
    }
  
}
