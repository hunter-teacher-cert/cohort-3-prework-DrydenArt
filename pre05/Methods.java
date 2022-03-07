import java.io.*;
import java.util.*;

public class Methods{
//tests whether a number is divisible by another
  //n is the integer to be tested, m is the integer to divide, return true if m is not 0 and n is divisible by m//
  public static boolean isDivisible(int n, int m){
    int n = 10;
    int m = 2;
    if (m != 0 && n % m == 0){
      return true;
    }else{
      return false;
    }
    }
  }

public static void main(String[] args){
  
  System.out.println(isDivisible());
  
}