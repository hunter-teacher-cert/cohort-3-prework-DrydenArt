import java.io.*;
import java.util.Arrays;

/**
  *Write a method called sieve that takes an integer parameter, n, and returns
a boolean array that indicates, for each number from 0 to n - 1, whether the
number is prime.
  */

public class Sieve {

  public static boolean[] sieve(int n) {
    //int n;
    boolean [] result = new boolean [n+1];//return array
    result[0] = false;
    result[1] = false;
    for (int i = 2; i <= n; i++) //find the prime
      result[i] = true;
    for (int number = 2; number <= (int)Math.sqrt(n);number++){
      if (result[number] == true){
        for (int indexInSeries = number*number;indexInSeries <= n; indexInSeries += number) {
          result[indexInSeries] = false; 
        }
      }
    }
    return result;
  }


  public static void main (String[] args) {
    System.out.println("Exercise 8.5 on page 137 in Think Java:");
    int n = 2;
    //boolean [] sieveResult = new sieveResult[n];
    //new sieveResult[n] = sieve(n);
    boolean [] prime;
    prime = sieve(n);
    System.out.println(Arrays.toString(prime));
  
    
  }
}