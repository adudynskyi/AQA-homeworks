/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {

  /**
   * Computes sum of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return sum of integers
   */
  public static int sum(int lowerBound, int upperBound) {
    int sum = 0;
    for (int i = lowerBound; i <= upperBound; i++) {
      sum += i;
    }
    return sum;
  }

  /**
   * Computes sum of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return sum of integers
   */
  public static int sum(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound.
   *
   * @param lowerBound lower bound
   * @param upperBound upper bound
   * @return average of integers
   */
  public static double average(int lowerBound, int upperBound) {
    int i = 0;
    while (lowerBound <= upperBound) {
      lowerBound++;
      i++;
    }
    return (double) (lowerBound + upperBound - i ) / 2;
  }

  /**
   * Computes average of running integers from a lower bound to an upper bound within an array.
   *
   * @param numbers running integers array
   * @return average of integers
   */
  public static double average(int[] numbers) {
    int sum = 0;
    int i = 0;
    do {
      sum += numbers[i];
      ++i;
    } while (i < numbers.length);
    return sum / (double) numbers.length;
  }
}
