import java.util.Scanner;

class switchCase{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		char vow = sc.next().charAt(0);
		
		switch (vow) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			System.out.println(vow+" is a vowel ");
			break;
			default:
			System.out.println(vow+" is a consonant");
		}
	}
}
