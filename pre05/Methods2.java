import java.io.*;
import java.util.*;

public class Methods2 {

  public static boolean isDivisible(int n, int m) {
    boolean flagDiv;
    if (m != 0 && n % m == 0) {
      return flagDiv = true;
  }else{
      return flagDiv = false;
  }
    
    //System.out.println(flagDiv);
  }


  public static void main(String[] args) {
    boolean flagDiv = isDivisible(7, 3); 
      System.out.println("Is it divisible? " +flagDiv);
    
    //int n = 7;
    //int m = 3;
    //isDivisible(7,3);
  }
}