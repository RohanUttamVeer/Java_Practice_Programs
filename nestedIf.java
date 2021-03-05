import java.util.*;
import java.io.*;
	
class nestedIf {
	public static void main(String[] args) {
		Double largest;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 numbers: ");
		Double n1 = sc.nextDouble();
		Double n2 = sc.nextDouble();
		Double n3 = sc.nextDouble();
		
		if(n1 >= n2){
			
			if(n2 >= n3) {
				largest = n1;
			}
			else{
				largest = n3;
				}
			} else {
				if(n2 >= n3){
					largest = n2;
				}
				else{
					largest = n3;
				}
			}
			System.out.println("largest number : "+largest);
		}
	}