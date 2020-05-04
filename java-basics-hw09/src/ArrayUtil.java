import java.util.HashSet;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

  /**
   * Finds the common elements between two arrays (String values).
   *
   * @param array1 first array
   * @param array2 second array
   * @return String array with common elements
   */
  public static String[] findCommon(String[] array1, String[] array2) {
    HashSet<String> commonStrings = new HashSet<>();
    for (String value : array1) {
      for (String s : array2) {
        if (value.equals(s))
          commonStrings.add(s);
      }
    }
    return commonStrings.toArray(new String[0]);
  }
}