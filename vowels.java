import java.util.Scanner;

class vowels{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		char vow = sc.next().charAt(0);
		
		if(vow == 'a' || vow == 'e' || vow == 'i' || vow == 'o' || vow == 'u'){
			System.out.println(vow +" is a vowel");
		}else{
			System.out.println(vow +" is a consonant");
		}
	}
}