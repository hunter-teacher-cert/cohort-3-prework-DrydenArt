import java.io.*;
import java.util.*;

public class Triangle {

  public static boolean isTriangle(int a, int b, int c) {
  if (a > b + c || b > a + c || c > a + b){
    System.out.println("False");    
  }
  else{
    System.out.println("True");
    }
    return result;
  }
  

  public static void main(String[] args) {
    
    System.out.println("This is a triangle: " + result);
    isTriangle(2,2,2);
  }
} 