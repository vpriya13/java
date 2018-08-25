public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
	        //Scanner class to read value
	        Scanner sc=new Scanner(System.in);
	         
	        System.out.print("Enter any integer number: ");
	        n=sc.nextInt();


if(n>0) {
	System.out.println("it is positive");
}
else if(n<0) {
	System.out.println("it is negative");
}
else {
	System.out.println("it is zero");
}
	}

}
