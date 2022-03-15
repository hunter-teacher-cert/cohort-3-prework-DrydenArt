import java.io.*;
import java.util.Arrays;


public class Practice8 {


  public static void printArray(int[] a) {
    //int[] a = {1, 2, 3, 4};
    int[] a;
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
      System.out.print(", " + a[i]);
    }
    System.out.print("}");
  }






  public static void main(String[] args) {
    int size = 10;
    int[] counts = new int[4];
    double[] values = new double[size];
    counts[0] = 7;
    counts[1] = counts[0] * 2;
    counts[2]++;
    counts[3] -= 60;
    int i = 0;
    while (i < 4) {
      System.out.println(counts[i]);
      i++;    
      //printArray(a[0]);

      System.out.println(Arrays.toString(a));
      
    }

  }
}