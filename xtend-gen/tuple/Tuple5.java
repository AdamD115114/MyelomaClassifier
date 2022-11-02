package tuple;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import tuple.Tuple4;

/**
 * A concrete class for tuples with a dimensionality of 5.
 */
@Accessors
@SuppressWarnings("all")
public class Tuple5<T0 extends Object, T1 extends Object, T2 extends Object, T3 extends Object, T4 extends Object> extends Tuple4<T0, T1, T2, T3> {
  /**
   * The 5th element (element with index 4) of this tuple.
   */
  private final T4 element4;
  
  /**
   * Creates a new tuple with dimensionality 5.
   */
  public Tuple5(final T0 element0, final T1 element1, final T2 element2, final T3 element3, final T4 element4) {
    super(element0, element1, element2, element3);
    this.element4 = element4;
  }
  
  /**
   * Returns the dimensionality of this tuple (5).
   * @see Tuple#getDim() Tuple.getDim()
   */
  @Override
  public int getDim() {
    return 5;
  }
  
  @Pure
  public T4 getElement4() {
    return this.element4;
  }
}
