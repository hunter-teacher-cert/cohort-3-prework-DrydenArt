import java.io.*;
import java.util.*;

public class Methods2 {

  public static boolean isTriangle(int a, int b, int c) {
    boolean flagTriangle;
    if (a > b + c || b > a + c || c > a + b){
        return flagTriangle = false;    
  }
  else{
    return flagTriangle = true;
    }
    //return flagTriangle;
  }
  

  public static boolean isDivisible(int n, int m) {
    boolean flagDiv;
    if (m != 0 && n % m == 0) {
      return flagDiv = true;
  }else{
      return flagDiv = false;
  }
    
  }


  public static void main(String[] args) {
    boolean flagTriangle = isTriangle(2, 2, 2);
      System.out.println("Is it a triangle? " +flagTriangle);
    boolean flagDiv = isDivisible(7, 3);
      System.out.println("Is it divisible? " +flagDiv);
      
    
    
  }
}