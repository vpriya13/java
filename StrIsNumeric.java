package GUVI_PLAYER;

import java.util.Scanner;

public class StrIsNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String string = sc.next();
        int numeric = 0;

        try {
            Double num = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            numeric = 1;
        }

        if(numeric==0)
            System.out.println("yes");
        else
            System.out.println("no");
	}

}
