class Addition{
	public static void main (String args[]) {
	
		int num1 = Integer.parseInt(args[0]); // take arguments as command line
		int num2 = Integer.parseInt(args[1]); // take arguments as command line
		
		int result = 0;
		result = num1 + num2;
		System.out.println("Addition of two numbers : " +result);	
	}
}