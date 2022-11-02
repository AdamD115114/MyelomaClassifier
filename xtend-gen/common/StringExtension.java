package common;

import com.google.common.base.Objects;
import common.BooleanFormatException;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class StringExtension {
  public static void print(final String s) {
    InputOutput.<String>println(s);
  }
  
  public static Long toLong(final String s) {
    long _xblockexpression = (long) 0;
    {
      if ((s == null)) {
        return null;
      }
      _xblockexpression = Long.parseLong(s);
    }
    return Long.valueOf(_xblockexpression);
  }
  
  public static Double toDouble(final String s) {
    double _xblockexpression = (double) 0;
    {
      if ((s == null)) {
        return null;
      }
      _xblockexpression = Double.parseDouble(s);
    }
    return Double.valueOf(_xblockexpression);
  }
  
  public static Boolean toBoolean(final String s) {
    if ((s == null)) {
      return null;
    }
    final String normalizedString = s.trim().toLowerCase();
    boolean _contains = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("true", "yes")).contains(normalizedString);
    if (_contains) {
      return Boolean.valueOf(true);
    }
    boolean _contains_1 = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("false", "no")).contains(normalizedString);
    if (_contains_1) {
      return Boolean.valueOf(false);
    }
    try {
      double _parseDouble = Double.parseDouble(normalizedString);
      return Boolean.valueOf((_parseDouble != 0D));
    } catch (final Throwable _t) {
      if (_t instanceof NumberFormatException) {
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    try {
      long _parseLong = Long.parseLong(normalizedString);
      return Boolean.valueOf((_parseLong != 0L));
    } catch (final Throwable _t) {
      if (_t instanceof NumberFormatException) {
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    throw new BooleanFormatException();
  }
  
  public static Boolean equal(final String s1, final String s2) {
    return Boolean.valueOf(Objects.equal(s1, s2));
  }
  
  public static Boolean notEqual(final String s1, final String s2) {
    return Boolean.valueOf((!Objects.equal(s1, s2)));
  }
  
  public static String append(final String s1, final String s2) {
    return (s1 + s2);
  }
  
  public static List<String> listOfCharacters(final String s) {
    final Function1<Character, String> _function = (Character it) -> {
      return it.toString();
    };
    return ListExtensions.<Character, String>map(((List<Character>)Conversions.doWrapArray(s.toCharArray())), _function);
  }
  
  public static List<String> listOfWords(final String s) {
    final Function1<String, Boolean> _function = (String it) -> {
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(it);
      return Boolean.valueOf((!_isNullOrEmpty));
    };
    return IterableExtensions.<String>toList(IterableExtensions.<String>filter(((Iterable<String>)Conversions.doWrapArray(s.split("\\W"))), _function));
  }
}
