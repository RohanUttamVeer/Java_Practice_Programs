class DayMonthDemo {
	public static void main(String args[]) {
		int num = Integer.parseInt(args[0]);
		int day = num % 30;
		int month = num / 30;
		
		System.out.println(num+" days = "+month+" Months and "+day+" Days.");
		
	}
}