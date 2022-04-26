import java.io.*;
import java.util.Arrays;

public class Sieve {

  public static boolean[] sieve(int n) {
    //int n;
    boolean [] result = new boolean [n];
    for (int i = 2; i < n; i++)
      result[i] = true;
    for (int number = 2; number <= (int)Math.sqrt(n);number++){
      if (result[number] == true){
        for (int indexInSeries = number*number;indexInSeries < n; indexInSeries += number) {
          result[indexInSeries] = false;
        }
      }
    }
    return result;
  }


  public static void main (String[] args) {
    System.out.println("Exercise 8.5 on page 137 in Think Java:");
    int n = 2;
    boolean [] result = new 
    
  }
}