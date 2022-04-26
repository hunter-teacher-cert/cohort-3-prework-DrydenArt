import java.io.*;
import java.util.Arrays;

public class Max {

  public static int[] indexOfMax(int[] a) {
    int index = 2;
    for (int i = 1; i < a.length; i++) {
      if (a[i] > a[index]){
        index = i;
      }
  }
    return index;  
}



  public static void main(String[] args) {
    System.out.println("Exercise 8.4, page 137 of Think Java:");
    int[] a = new int[3];
    int index;
    a[0] = 10;
    a[1] = 3;
    a[2] = 16;
    indexOfMax(a);
    //indexOfMax(a);
    System.out.println(a);
  }
}