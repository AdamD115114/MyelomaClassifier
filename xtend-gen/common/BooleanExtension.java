package common;

import com.google.common.base.Objects;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class BooleanExtension {
  public static void print(final Boolean b) {
    InputOutput.<Boolean>println(b);
  }
  
  public static Long toLong(final Boolean b) {
    long _xblockexpression = (long) 0;
    {
      if ((b == null)) {
        return null;
      }
      long _xifexpression = (long) 0;
      if ((b).booleanValue()) {
        _xifexpression = 1L;
      } else {
        _xifexpression = 0L;
      }
      _xblockexpression = _xifexpression;
    }
    return Long.valueOf(_xblockexpression);
  }
  
  public static Double toDouble(final Boolean b) {
    double _xblockexpression = (double) 0;
    {
      if ((b == null)) {
        return null;
      }
      double _xifexpression = (double) 0;
      if ((b).booleanValue()) {
        _xifexpression = 1D;
      } else {
        _xifexpression = 0D;
      }
      _xblockexpression = _xifexpression;
    }
    return Double.valueOf(_xblockexpression);
  }
  
  public static String toString(final Boolean b) {
    String _string = null;
    if (b!=null) {
      _string=b.toString();
    }
    return _string;
  }
  
  public static Boolean not(final Boolean b) {
    return Boolean.valueOf((!(b).booleanValue()));
  }
  
  public static Boolean equal(final Boolean b1, final Boolean b2) {
    return Boolean.valueOf(Objects.equal(b1, b2));
  }
  
  public static Boolean notEqual(final Boolean b1, final Boolean b2) {
    return Boolean.valueOf((!Objects.equal(b1, b2)));
  }
  
  public static Boolean and(final Boolean b1, final Boolean b2) {
    return Boolean.valueOf(((b1).booleanValue() && (b2).booleanValue()));
  }
  
  public static Boolean or(final Boolean b1, final Boolean b2) {
    return Boolean.valueOf(((b1).booleanValue() || (b2).booleanValue()));
  }
  
  public static Boolean ifSwitch(final Boolean b) {
    return b;
  }
}
