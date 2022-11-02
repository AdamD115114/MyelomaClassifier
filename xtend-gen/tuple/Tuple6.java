package tuple;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import tuple.Tuple5;

/**
 * A concrete class for tuples with a dimensionality of 6.
 */
@Accessors
@SuppressWarnings("all")
public class Tuple6<T0 extends Object, T1 extends Object, T2 extends Object, T3 extends Object, T4 extends Object, T5 extends Object> extends Tuple5<T0, T1, T2, T3, T4> {
  /**
   * The 6th element (element with index 5) of this tuple.
   */
  private final T5 element5;
  
  /**
   * Creates a new tuple with dimensionality 6.
   */
  public Tuple6(final T0 element0, final T1 element1, final T2 element2, final T3 element3, final T4 element4, final T5 element5) {
    super(element0, element1, element2, element3, element4);
    this.element5 = element5;
  }
  
  /**
   * Returns the dimensionality of this tuple (6).
   * @see Tuple#getDim() Tuple.getDim()
   */
  @Override
  public int getDim() {
    return 6;
  }
  
  @Pure
  public T5 getElement5() {
    return this.element5;
  }
}
