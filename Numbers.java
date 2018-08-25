public class Numbers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("it is even number");
		}
		else if(num%2!=0) {
			System.out.println("it is odd number");
		}
    else{
    System.out.println("invalid");
	}

}
}
