import java.util.Scanner;

class largestNo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int n1 = sc.nextInt();
		System.out.print("");
		int n2 = sc.nextInt();
		System.out.print("");
		int n3 = sc.nextInt();
		
		if (n1 >= n2 && n1 >= n3){
			System.out.println(n1 +" is the largest");
		}else if (n2 >= n3 && n2 >= n3) {
			System.out.println(n2 +" is the largest");
		}else{
			System.out.println(n3+ " is the largest");
		}
	}
}