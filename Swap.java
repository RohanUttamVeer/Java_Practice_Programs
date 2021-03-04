class Swap {
	public static void main(String args[]) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		System.out.println("---Before Swapping---");
		System.out.println("Number I : "+num1);
		System.out.println("Number II : "+num2);
		//SwapLogic
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("---After Swaping---");
		System.out.println("Number I : "+num1);
		System.out.println("Number II : "+num2);
		
	}
}