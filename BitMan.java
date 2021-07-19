import java.util.Scanner;

public class BitMan{
	
	static int count_set(int n){
		int c = 0;
		while(n>0){
			if ((n & 1) == 1) c++;
			System.out.println(n);
			n>>=1;
		}
		return c;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		int n = sc.nextInt();
		//int b = sc.nextInt();
		// 2's complement
		System.out.println(-~n);
		}
		
		/*
		//Detect if two integers have opposite signs or not
		boolean isOpp = ((n ^ b) < 0); // xor operator results leftmost bit to 1 which results in a -ve no.
		System.out.println(isOpp ? "opposite signs" : "same signs");
		*/
		/*
		//swap two no.
		n = n^b;
		b = n^b;
		n = n^b;
		System.out.println(n+" "+b);
		*/
		//System.out.println(Integer.bitCount(n));
		
		/*
		//no. even or odd and left shift op. for multi. with 2 and right shift op. for divid. by 2...
		System.out.println((n&1) == 1 ? "odd" : "even");
		System.out.println(n+" / 2 : "+(n>>1));
		System.out.println("2^"+n+" : "+(1<<n));
		*/
	}
}