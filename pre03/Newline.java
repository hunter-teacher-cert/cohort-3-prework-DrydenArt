public class Newline {

  public static void newLine() {
    System.out.println();
  }
  
  public static void threeLine() {
    newLine();
    newLine();
    newLine();

  }
  //it starts reading here at main regardless of where it is//
  public static void main(String [] args){
    System.out.println("First line.");//executes first//
    threeLine();//invokes threeLine method, invokes newLine method and executes//
    System.out.println("Second line.");//comes back to main for this instruction//
  
    
  }
}