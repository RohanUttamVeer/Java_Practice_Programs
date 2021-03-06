import java.util.*;
import java.io.*;

public class LastDigit {
  public static void main(String args[]) throws IOException {

    int n;
    Scanner sc = new Scanner (System.in);
    System.out.print("");
    n = sc.nextInt();
    
    int x = (n / 10);
    System.out.println(x);
    
  }
}