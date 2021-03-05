import java.util.*;
import java.io.*;

public class FirstDigit {
  public static void main(String args[]) throws IOException {
    int x, i;
	 int a[] = new int[10]; 
    Scanner sc = new Scanner(System.in);
	 System.out.println("");
	 x = sc.nextInt();
	 
    for (i = 0; i < x; i++)
	    {
	     a[i] = sc.nextInt();
	      }
			
			for(i = 0; i < x; i++)
	         {
	           while(a[i] >= 10)
		     		{
					   a[i] = a[i] / 10;
                      	}
	 System.out.println(a[i]);
			 }
		  }
		}