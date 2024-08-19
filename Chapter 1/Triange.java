//Triangle.java
//Chapter 1 
public class Main {
  public static void main(String[] args) {
    int a = 7, b = 0;
    for (int i = 1; i <= a; ++i, b = 0) {
      for (int space = 1; space <= a - i; ++space) {
        System.out.print("  ");
      }
      while (b != 2 * i - 1) {
        System.out.print("* ");
        ++b;
      }
      System.out.println();
    }
  }
}
