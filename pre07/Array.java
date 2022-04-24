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

  //public static int histogram()





  public static void main(String[] args) {
    System.out.println("Exercise 8.1 from Think Java, page 135");
    double [] values = new double [9];
    double [] powArray = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};
    System.out.println(powArray(values));

    //int[] counts = new int[100];
    //for (int score : scores) {
      //counts[score]++;
    
  }
}
