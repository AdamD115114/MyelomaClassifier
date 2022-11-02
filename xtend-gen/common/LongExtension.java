package common;

import com.google.common.base.Objects;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class LongExtension {
  public static void print(final Long l) {
    InputOutput.<Long>println(l);
  }
  
  public static Double toDouble(final Long l) {
    double _xblockexpression = (double) 0;
    {
      if ((l == null)) {
        return null;
      }
      _xblockexpression = l.doubleValue();
    }
    return Double.valueOf(_xblockexpression);
  }
  
  public static Boolean toBoolean(final Long l) {
    boolean _xblockexpression = false;
    {
      if ((l == null)) {
        return null;
      }
      _xblockexpression = ((l).longValue() != 0);
    }
    return Boolean.valueOf(_xblockexpression);
  }
  
  public static String toString(final Long l) {
    String _string = null;
    if (l!=null) {
      _string=l.toString();
    }
    return _string;
  }
  
  public static Boolean equal(final Long l1, final Long l2) {
    return Boolean.valueOf(Objects.equal(l1, l2));
  }
  
  public static Boolean notEqual(final Long l1, final Long l2) {
    return Boolean.valueOf((!Objects.equal(l1, l2)));
  }
  
  public static Boolean less(final Long l1, final Long l2) {
    return Boolean.valueOf((l1.compareTo(l2) < 0));
  }
  
  public static Boolean lessOrEqual(final Long l1, final Long l2) {
    return Boolean.valueOf((l1.compareTo(l2) <= 0));
  }
  
  public static Boolean greater(final Long l1, final Long l2) {
    return Boolean.valueOf((l1.compareTo(l2) > 0));
  }
  
  public static Boolean greaterOrEqual(final Long l1, final Long l2) {
    return Boolean.valueOf((l1.compareTo(l2) >= 0));
  }
  
  public static Long add(final Long l1, final Long l2) {
    return Long.valueOf(((l1).longValue() + (l2).longValue()));
  }
  
  public static Long subtract(final Long l1, final Long l2) {
    return Long.valueOf(((l1).longValue() - (l2).longValue()));
  }
  
  public static Long multiply(final Long l1, final Long l2) {
    return Long.valueOf(((l1).longValue() * (l2).longValue()));
  }
  
  public static Long divide(final Long l1, final Long l2) {
    return Long.valueOf(((l1).longValue() / (l2).longValue()));
  }
}
