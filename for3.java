//Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 
import java.util.Scanner;
class for3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int x = sc.nextInt();
		
		for (int i = 1; i <= 10; i++){
			System.out.println(x*i);
		}
	}
}