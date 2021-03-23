//Write a program to find the factorial value of any number entered through the keyboard.
import java.util.Scanner;
class FactFor{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int num = sc.nextInt();
		int result = 1;
		
		for(int i = 1; i <= num; i++){
			result = result * i;
		}
		System.out.println(result);
	}
}