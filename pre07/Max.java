import java.io.*;
import java.util.Arrays;

public class Max {

  public static int[] indexOfMax(int[] a) {
    int index = 0;
    for (int i = 1; i < a.length; i++) {
      if (a[i] > a[index]){
        index = i;
      }
  }
    return index;  
}



  public static void main(String[] args) {
    System.out.println("Exercise 8.4, page 137 of Think Java:");
    int[] a = new int[5];
    int index;
    a[0] = 10;
    a[1] = 3;
    a[2] = 16;
    a[3] = 2;
    a[4] = 12;
    System.out.println(Arrays.toString(a));
    int index = indexOfMax(5);
    System.out.println(Arrays.toString(index));
  }
}