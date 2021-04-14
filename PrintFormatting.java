// learn output formatting using printf in java
// refer to the video below 
// https://youtu.be/moQ3Kr8ouiU
import java.util.Scanner;
public class PrintFormatting {
	public static void main(String[] args){
	
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