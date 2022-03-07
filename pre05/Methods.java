import java.io.*;
import java.util.*;

public class Methods{
//tests whether a number is divisible by another
  //n is the integer to be tested, m is the integer to divide, return true if m is not 0 and n is divisible by m//
  public static boolean isDivisible(int n, int m){
    boolean flagDiv;
    if (m != 0 && n % m == 0){
      return flagDiv = true;
    }else{
      return flagDiv = false;
    }
    //why don't I need my return statement?//
  }

  public static void main(String[] args){
  boolean flagDiv = isDivisible(7, 3);
  System.out.println("Is it divisible? " + flagDiv);

  }
}