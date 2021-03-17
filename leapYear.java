import java.util.*;
import java.io.*;

public class leapYear {
  public static void main(String args[]) throws IOException {
    boolean leap = false;
    int a[] = new int[10]; 
    Scanner sc = new Scanner(System.in);
	  System.out.println("");
	  int x = sc.nextInt();
	 
    for (int i = 0; i < x; i++)
	    {
	     a[i] = sc.nextInt();
	      }
	      
			for(int i = 0; i < x; i++)
	         {
	      if (a[i] % 4 == 0) {

      if (a[i] % 100 == 0) {

      
        if (a[i] % 400 == 0)
          leap = true;
        else
          leap = false;
      }
      
      else
        leap = true;
    }
    
    else
      leap = false;
 if (leap)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
  }
}