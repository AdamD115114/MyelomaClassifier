package common;

import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import tuple.Tuple2;

@SuppressWarnings("all")
public class ListExtension {
  public static <T extends Object> void print(final List<T> l) {
    InputOutput.<List<T>>println(l);
  }
  
  public static <T extends Object> Boolean equal(final List<T> l1, final List<T> l2) {
    return Boolean.valueOf(((l1 == l2) || l1.equals(l2)));
  }
  
  public static <T extends Object> Boolean notEqual(final List<T> l1, final List<T> l2) {
    Boolean _equal = ListExtension.<T>equal(l1, l2);
    return Boolean.valueOf((!(_equal).booleanValue()));
  }
  
  public static <T extends Object> T getElement(final List<T> l, final Long i) {
    return l.get(i.intValue());
  }
  
  public static <T extends Object> void setElement(final List<T> l, final Long i, final T e) {
    l.set(i.intValue(), e);
  }
  
  public static <T extends Object> void removeElement(final List<T> l, final T e) {
    l.remove(e);
  }
  
  public static <T extends Object> void insertAtIndex(final List<T> l, final Long i, final T e) {
    l.add(i.intValue(), e);
  }
  
  public static <T extends Object> T removeAtIndex(final List<T> l, final Long i) {
    return l.remove(i.intValue());
  }
  
  public static <T extends Object> Tuple2<T, List<T>> splitFirst(final List<T> l) {
    T _head = IterableExtensions.<T>head(l);
    Iterable<T> _tail = IterableExtensions.<T>tail(l);
    return new Tuple2(_head, _tail);
  }
  
  public static <T extends Object> Tuple2<List<T>, T> splitLast(final List<T> l) {
    List<T> _reverse = ListExtensions.<T>reverse(IterableExtensions.<T>toList(IterableExtensions.<T>tail(ListExtensions.<T>reverse(l))));
    T _last = IterableExtensions.<T>last(l);
    return new Tuple2<List<T>, T>(_reverse, _last);
  }
  
  public static <T extends Object> List<T> prepend(final List<T> l, final T e) {
    return IterableExtensions.<T>toList(Iterables.<T>concat(Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(e)), l));
  }
  
  public static <T extends Object> List<T> append(final List<T> l, final T e) {
    return IterableExtensions.<T>toList(Iterables.<T>concat(l, Collections.<T>unmodifiableList(CollectionLiterals.<T>newArrayList(e))));
  }
  
  public static <T extends Object> List<T> reverseOrder(final List<T> l) {
    return ListExtensions.<T>reverse(l);
  }
}
