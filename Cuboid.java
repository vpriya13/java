package GUVI;

import java.util.Scanner;

public class Cuboid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int width=sc.nextInt();
		int height=sc.nextInt();
		int volume=length*width*height;
		int surfacearea=2*(length*width)+2*(length*height)+2*(height*width);
		System.out.println(surfacearea+" "+volume);

	}

}
