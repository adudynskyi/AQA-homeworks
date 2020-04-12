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
    String patternStr = "(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})($|,|/)";
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