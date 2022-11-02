package tuple;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import tuple.Tuple6;

/**
 * A concrete class for tuples with a dimensionality of 7.
 */
@Accessors
@SuppressWarnings("all")
public class Tuple7<T0 extends Object, T1 extends Object, T2 extends Object, T3 extends Object, T4 extends Object, T5 extends Object, T6 extends Object> extends Tuple6<T0, T1, T2, T3, T4, T5> {
  /**
   * The 7th element (element with index 6) of this tuple.
   */
  private final T6 element6;
  
  /**
   * Creates a new tuple with dimensionality 7.
   */
  public Tuple7(final T0 element0, final T1 element1, final T2 element2, final T3 element3, final T4 element4, final T5 element5, final T6 element6) {
    super(element0, element1, element2, element3, element4, element5);
    this.element6 = element6;
  }
  
  /**
   * Returns the dimensionality of this tuple (7).
   * @see Tuple#getDim() Tuple.getDim()
   */
  @Override
  public int getDim() {
    return 7;
  }
  
  @Pure
  public T6 getElement6() {
    return this.element6;
  }
}
