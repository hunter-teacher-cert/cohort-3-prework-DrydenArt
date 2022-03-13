import java.io.*;
import java.util.*;

public class While { //page 106

  public static void countdown(int n) {
    while (n > 0) { //evaluate the condition
      System.out.println(n); //if false, skip body, go to next
      n = n - 1;
    }
    System.out.println("Blast Off!");
  }

  public static void sequence(int n) {
    while (n != 1) {
      System.out.println(n);
      if (n % 2 == 0) {
        n = n / 2;
      }else {
        n = n * 3 + 1;
      }
    }
  }

  public static void log(int i) {
    //int i = 1;
    while (i < 10) {
      double x = i;
      System.out.println(x + "  " + Math.log(x) / Math.log(2));
      i = i +1;
    }
  }

  public static void main(String[] args){
    System.out.println("here we go again");
    countdown(10);
    sequence(3);
    log(1);
    
  }
}