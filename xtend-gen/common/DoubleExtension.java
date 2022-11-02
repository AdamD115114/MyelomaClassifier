package common;

import com.google.common.base.Objects;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class DoubleExtension {
  public static void print(final Double d) {
    InputOutput.<Double>println(d);
  }
  
  public static Long toLong(final Double d) {
    long _xblockexpression = (long) 0;
    {
      if ((d == null)) {
        return null;
      }
      _xblockexpression = d.longValue();
    }
    return Long.valueOf(_xblockexpression);
  }
  
  public static Boolean toBoolean(final Double d) {
    boolean _xblockexpression = false;
    {
      if ((d == null)) {
        return null;
      }
      _xblockexpression = ((d).doubleValue() != 0);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  public static String toString(final Double d) {
    String _string = null;
    if (d!=null) {
      _string=d.toString();
    }
    return _string;
  }
  
  public static Boolean equal(final Double d1, final Double d2) {
    return Boolean.valueOf(Objects.equal(d1, d2));
  }
  
  public static Boolean notEqual(final Double d1, final Double d2) {
    return Boolean.valueOf((!Objects.equal(d1, d2)));
  }
  
  public static Boolean less(final Double d1, final Double d2) {
    return Boolean.valueOf((d1.compareTo(d2) < 0));
  }
  
  public static Boolean lessOrEqual(final Double d1, final Double d2) {
    return Boolean.valueOf((d1.compareTo(d2) <= 0));
  }
  
  public static Boolean greater(final Double d1, final Double d2) {
    return Boolean.valueOf((d1.compareTo(d2) > 0));
  }
  
  public static Boolean greaterOrEqual(final Double d1, final Double d2) {
    return Boolean.valueOf((d1.compareTo(d2) >= 0));
  }
  
  public static Double add(final Double d1, final Double d2) {
    return Double.valueOf(DoubleExtensions.operator_plus(d1, d2));
  }
  
  public static Double subtract(final Double d1, final Double d2) {
    return Double.valueOf(DoubleExtensions.operator_minus(d1, d2));
  }
  
  public static Double multiply(final Double d1, final Double d2) {
    return Double.valueOf(DoubleExtensions.operator_multiply(d1, d2));
  }
  
  public static Double divide(final Double d1, final Double d2) {
    return Double.valueOf(DoubleExtensions.operator_divide(d1, d2));
  }
}
