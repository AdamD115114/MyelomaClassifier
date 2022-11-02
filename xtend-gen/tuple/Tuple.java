package tuple;

import com.google.common.base.Objects;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import tuple.Tuple1;
import tuple.Tuple10;
import tuple.Tuple2;
import tuple.Tuple3;
import tuple.Tuple4;
import tuple.Tuple5;
import tuple.Tuple6;
import tuple.Tuple7;
import tuple.Tuple8;
import tuple.Tuple9;

/**
 * An abstract super class for tuples. A tuple is a finite ordered list of elements.
 * <p>
 * The largest tuple is {@linkplain Tuple10} with a dimensionality of 10.
 * Larger tuples will be generated as needed. (Depends on the largest number of ports in an
 * {@linkplain sib.atomic.AtomicSib AtomicSib} or its {@linkplain sib.atomic.AtomicBranch branches}.)
 */
@SuppressWarnings("all")
public abstract class Tuple implements Iterable<Object> {
  /**
   * An {@linkplain Iterator} over a {@linkplain Tuple}.
   */
  public static class TupleIterator implements Iterator<Object> {
    /**
     * The tuple over which to iterate.
     */
    private final Tuple tuple;
    
    /**
     * The index of the current element. If this value equals -1, then no element
     * has been returned yet.
     */
    private int currentIndex;
    
    /**
     * Creates a new iterator for the specified <code>tuple</code>.
     */
    public TupleIterator(final Tuple tuple) {
      this.tuple = tuple;
      this.currentIndex = (-1);
    }
    
    /**
     * Returns {@code true} if the iteration has more elements.
     * @ see java.util.Iterator#hasNext() Iterator.hasNext()
     */
    @Override
    public boolean hasNext() {
      int _dim = this.tuple.getDim();
      int _minus = (_dim - 1);
      return (this.currentIndex < _minus);
    }
    
    /**
     * Returns the next element in the iteration.
     * @throws NoSuchElementException if the iteration has no more elements.
     * @see java.util.Iterator#next() Iterator.next()
     */
    @Override
    public Object next() {
      boolean _hasNext = this.hasNext();
      if (_hasNext) {
        int _currentIndex = this.currentIndex;
        this.currentIndex = (_currentIndex + 1);
        return this.tuple.get(this.currentIndex);
      } else {
        throw new NoSuchElementException();
      }
    }
  }
  
  /**
   * Returns the dimensionality of this tuple.
   */
  public abstract int getDim();
  
  /**
   * Returns the element at the provided <code>index</code>.
   * @throws IndexOutOfBoundsException if the <code>index</code> is not in
   *         the range <code>0 ..< </code>{@link #getDim() getDim()}.
   */
  public Object get(final int index) {
    Object _switchResult = null;
    final Tuple it = this;
    boolean _matched = false;
    if (it instanceof Tuple1) {
      if ((index == 0)) {
        _matched=true;
        _switchResult = ((Tuple1<?>)it).getElement0();
      }
    }
    if (!_matched) {
      if (it instanceof Tuple2) {
        if ((index == 1)) {
          _matched=true;
          _switchResult = ((Tuple2<?, ?>)it).getElement1();
        }
      }
    }
    if (!_matched) {
      if (it instanceof Tuple3) {
        if ((index == 2)) {
          _matched=true;
          _switchResult = ((Tuple3<?, ?, ?>)it).getElement2();
        }
      }
    }
    if (!_matched) {
      if (it instanceof Tuple4) {
        if ((index == 3)) {
          _matched=true;
          _switchResult = ((Tuple4<?, ?, ?, ?>)it).getElement3();
        }
      }
    }
    if (!_matched) {
      if (it instanceof Tuple5) {
        if ((index == 4)) {
          _matched=true;
          _switchResult = ((Tuple5<?, ?, ?, ?, ?>)it).getElement4();
        }
      }
    }
    if (!_matched) {
      if (it instanceof Tuple6) {
        if ((index == 5)) {
          _matched=true;
          _switchResult = ((Tuple6<?, ?, ?, ?, ?, ?>)it).getElement5();
        }
      }
    }
    if (!_matched) {
      if (it instanceof Tuple7) {
        if ((index == 6)) {
          _matched=true;
          _switchResult = ((Tuple7<?, ?, ?, ?, ?, ?, ?>)it).getElement6();
        }
      }
    }
    if (!_matched) {
      if (it instanceof Tuple8) {
        if ((index == 7)) {
          _matched=true;
          _switchResult = ((Tuple8<?, ?, ?, ?, ?, ?, ?, ?>)it).getElement7();
        }
      }
    }
    if (!_matched) {
      if (it instanceof Tuple9) {
        if ((index == 8)) {
          _matched=true;
          _switchResult = ((Tuple9<?, ?, ?, ?, ?, ?, ?, ?, ?>)it).getElement8();
        }
      }
    }
    if (!_matched) {
      if (it instanceof Tuple10) {
        if ((index == 9)) {
          _matched=true;
          _switchResult = ((Tuple10<?, ?, ?, ?, ?, ?, ?, ?, ?, ?>)it).getElement9();
        }
      }
    }
    if (!_matched) {
      throw new IndexOutOfBoundsException();
    }
    return _switchResult;
  }
  
  /**
   * Indicates whether some other tuple is "equal to" this one. A tuple is
   * equal to another tuple, iff all of their elements are pairwise equal to
   * each other.
   * @see Object#equals(Object) Object.equals(Object)
   */
  @Override
  public boolean equals(final Object other) {
    boolean _matched = false;
    if (Objects.equal(other, null)) {
      _matched=true;
      return false;
    }
    if (!_matched) {
      if (Objects.equal(other, this)) {
        _matched=true;
        return true;
      }
    }
    if (!_matched) {
      if (other instanceof Tuple) {
        int _dim = this.getDim();
        int _dim_1 = ((Tuple)other).getDim();
        boolean _equals = (_dim == _dim_1);
        if (_equals) {
          _matched=true;
          int _dim_2 = this.getDim();
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _dim_2, true);
          for (final Integer i : _doubleDotLessThan) {
            Object _get = this.get((i).intValue());
            Object _get_1 = ((Tuple)other).get((i).intValue());
            boolean _notEquals = (!Objects.equal(_get, _get_1));
            if (_notEquals) {
              return false;
            }
          }
          return true;
        }
      }
    }
    return false;
  }
  
  /**
   * Returns a string representation of the tuple.
   * @see Object#toString() Object.toString()
   */
  @Override
  public String toString() {
    final Function1<Object, CharSequence> _function = (Object it) -> {
      return it.toString();
    };
    return IterableExtensions.<Object>join(this, "(", ", ", ")", _function);
  }
  
  /**
   * Returns an iterator over the elements of this tuple.
   * @see Iterable#iterator() Iterable.iterator()
   */
  @Override
  public Iterator<Object> iterator() {
    return new Tuple.TupleIterator(this);
  }
}
