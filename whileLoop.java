import java.util.Scanner;

class whileLoop{
	public static void main(String[] args){
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		while(num >=0){
			sum += num;
			
			System.out.println("Enter number: ");
			num = sc.nextInt();
		}
		System.out.println("Sum: " +sum);
	}
}