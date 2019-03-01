package vmp11;

import java.util.Scanner;
public class Duration
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int runtime = sc.nextInt(); // number of total runtime minutes

		int hours = runtime / 60;

		int minutes = runtime % 60; // 5 in this case.

		System.out.println(hours + " " + minutes );
	}
}
