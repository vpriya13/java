package practice;

public class Largest {
	    public static void main(String[] args) {

	        int n1 = 50, n2 = 35, n3 = 55;

	        if(n1 >= n2) {
	            if(n1 >= n3)
	                System.out.println(n1 + " is the largest number.");
	            else
	                System.out.println(n3 + " is the largest number.");
	        } else {
	            if(n2 >= n3)
	                System.out.println(n2 + " is the largest number.");
	            else
	                System.out.println(n3 + " is the largest number.");
	        }
	    }
	}

