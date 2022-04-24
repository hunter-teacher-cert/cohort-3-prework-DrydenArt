import java.io.*;
import java.util.Arrays;

public class Array {


  public static double [] powArray(double [] a, double power) {
    double[] values = new double[a.length];
    double power;
    for (int i = 0; i < a.length; i++){
      values[i] = Math.pow(a[i], power);//p128: squares the double array
    }
    return values;
    //System.out.println(array[i]);
  }

  //public static int histogram()


  public static void main(String[] args) {
    System.out.println("Exercise 8.1 from Think Java, page 135");
    //double [] powArray = new double [5];
    double [] powArray = {1.0, 2.0, 3.0, 4.0, 5.0};
    System.out.println(powArray(values));
    //System.out.println(powArray[i]);
    //System.out.println(powArray[values]);
    //System.out.println(powArray[return]);
    //powArray[0] = 1.0;
    //powArray[1] = 2.0;
    //powArray[2] = 3.0;
    //powArray[3] = 4.0;
    //powArray[4] = 5.0;
    //powArray(array);
  

    //int[] counts = new int[100];
    //for (int score : scores) {
      //counts[score]++;
    
  }
}
