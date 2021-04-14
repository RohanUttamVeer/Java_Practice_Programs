// learn output formatting using printf in java
// refer to the video below 
// https://youtu.be/moQ3Kr8ouiU
import java.util.Scanner;
public class test {
	public static void main(String[] args){
	/*
	System.out.printf("%d ", 21);  // int 
	System.out.printf("%f ", 2.1); // float
	System.out.printf("%c ", 'r'); // char	for	lower	case
	System.out.printf("%C ", 'r'); // char for 	upper case
	System.out.printf("%s ", "rohan"); // string	for 	lower	case
	System.out.printf("%S ", "rohan"); // string for	upper	case
	System.out.printf("%b ", 3 < 5); // boolean in	lower case 
	System.out.printf("%B ", 6 < 5); // boolean in	upper case
	System.out.printf("%n \n"); // newline
	System.out.printf("%%"); // to print percent
	*/
	
	
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	int b = sc.nextInt();
	System.out.printf("%5s %02d",	a,	b); // 5 between %s gives 5 no. of spaces between the next input from right
						   // if -5 is updated between %s then it gives 5 no. of spaces from the beginning from left
						 // print single character for result
	
	
	/*Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Float m = sc.nextFloat();
	char ch = sc.next().charAt(0);
	System.out.printf("%d$%.2f$%c" , n , m , ch);
	*/
	
	/* Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.printf("%-15s%03d%n", s1, x);
					 System.out.printf("rohan");
            }
            System.out.println("================================");
				*/
	}
}

// try executing every section and keep exploring %%good_luck%%
