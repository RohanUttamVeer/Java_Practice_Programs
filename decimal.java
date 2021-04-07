import java.util.*;
  import java.io.*;
  
  public class decimal {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      System.out.print("");
      int n = sc.nextInt();
      double m = sc.nextDouble();
      String ch = sc.next();
      System.out.print(n);
		System.out.format("$%.2f", m); // two digits after decimal 
      System.out.print("$"+ch);
    }
  }