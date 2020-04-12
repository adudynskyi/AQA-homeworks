public class ExampleException {
  public static int rectangleArea(int a, int b) throws RuntimeException {
    if (a > 0 && b > 0)
      return a * b;
    else {
      throw new IllegalArgumentException("At least one parameter is not valid!");
    }
  }
}


