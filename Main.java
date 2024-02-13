import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    double var1, var2, var3, var4;
    double result;

    var1 = 10.0;
    var2 = 2.0;
    var3 = 5.0;
    var4 = 20.0;

    // should display the value 80
    result = var1 * var2 / var3 * var4;
    System.out.println("result = " + result);

    // should display the value 0.2
    result = var1 * var2 / (var3 * var4);
    System.out.println("result = " + result);

    // should display the value 1.0
    result = var1 / var2 / var3;
    System.out.println("result = " + result);

    // should display the value 25.0
    result = var1 / (var2 / var3);
    System.out.println("result = " + result);

  }
}
