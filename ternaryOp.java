import java.util.Scanner;
class ternaryOp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int a = sc.nextInt();
		
		String evenOdd = (a % 2 == 0) ? "even": "odd";
		System.out.println(evenOdd);
	}
}