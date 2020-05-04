import java.util.regex.Pattern;
import java.util.regex.Matcher;


/**
 * Regular expressions.
 */
public class RegExp {

  /**
   * Get IP address from text.
   * @param text text to parse
   * @return String with IP address
   */
  public static String getIpAddress(String text) {
    // String patternStr = "(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})($|,|/)";
    String patternStr = "((([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])(\\.|$|(?=,)|(?=/))){4})";
    // String patternStr = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";

    Pattern pat = Pattern.compile(patternStr);
    Matcher mat = pat.matcher(text);
    String result;
    if (mat.find()) {
        result = mat.group(1);
    }
    else
      result = "";
    return result;
  }
}