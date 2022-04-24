import java.io.*;
import java.util.Arrays;

public class Array {


  public static double [] powArray(double [] a, double power) {
    double[] values = new double[a.length];
    for (int i = 0; i < a.length; i++){
      values[i] = Math.pow(a[i], power);//p128: squares the double array
    }
    return values;
  }

  public static int[] histogram(int[] a, int scores){
    int[] counter = new int[100];
    for (int score : scores); {
      counter[score]++;
    }
    return counter;
  }


  public static void main(String[] args) {
    System.out.println("Exercise 8.1.1 from Think Java, page 135");
    double[] a;
    a = new double [5];
    double power = 2.0;
    a[0] = 1.0;
    a[1] = 2.0;
    a[2] = 3.0;
    a[3] = 4.0;
    a[4] = 5.0;
    System.out.println(Arrays.toString(a));
    powArray(a, 2.0);
    double[] values;//this stored the return values, declaring the var
    values = powArray(a, 2.0);//this is how it is assigned to the method
    System.out.println(Arrays.toString(values));
    
    System.out.println("Exercise 8.1.2");
    int[] a = new int[100];
    int scores = 0; 
    int[] counter = histogram(a, 100);
    int[] element = ;
    
    histogram(a, 100);
    System.out.println(Arrays.toString(counter));
  

    //int[] counts = new int[100];
    //for (int score : scores) {
      //counts[score]++;
    
  }
}
