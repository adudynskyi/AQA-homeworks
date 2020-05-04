import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleExceptionTest {

  /**
   * Test data for positive test.
   *
   * @return test data array
   */
  @DataProvider(name = "data")
  public static Object[][] data() {
    return new Object[][]{
        {2, 2, 4},
        {2, 3, 6},
        {12, 23, 276},
        {30, 10, 300}
    };
  }

  /**
   * Test data for exception test.
   *
   * @return test data array
   */
  @DataProvider(name = "negativeData")
  public static Object[][] negativeData() {
    return new Object[][]{
        {-2, 2},
        {2, -2},
        {0, -1},
        {-2, -2}
    };
  }

  @Test(dataProvider = "data")
  public void testRectangleArea(int a, int b, int c) {
    c = ExampleException.rectangleArea(a, b);
    assertEquals(a, b, c);
  }


  @Test(dataProvider = "negativeData")
  public void testRectangleAreaNegative(int a, int b) {
    try {
      int e = ExampleException.rectangleArea(a, b);
      fail("Expected an IllegalArgumentException to be thrown");
    } catch (IllegalArgumentException anIllegalArgumentException) {
      assertEquals(anIllegalArgumentException.getMessage(), "input value is below zero!");
    }
  }
}