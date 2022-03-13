import java.io.*;
import java.util.*;

public class Loops {

  public static void printRow(int n, int cols) {
    int i = 1;
    while (i <= cols) {
      System.out.printf("%4d", n * i);
      i = i + 1;
    }
    System.out.println();
  }

  public static void printTable2(int rows) {
    for (int i = 1; i <= rows; i = i + 1) {
      printRow(i, rows);
      loop(10);
    }
  }


  public static void loop(int n) {
    int i = n;
    while (i > 1) {
      System.out.println(i);
      if (i% 2 == 0) {
        i = i / 2;
      }else {
        i = i + 1;
      }
    }
  }

  public static double squareRoot() {
    
  }


  public static void main(String[] args) {
    System.out.print("Exercises 1, 2, 3 and 4");
    System.out.println("from Think Java, 7.9:");
    printTable2(1);
  }
}