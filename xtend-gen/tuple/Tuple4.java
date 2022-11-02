package tuple;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import tuple.Tuple3;

/**
 * A concrete class for tuples with a dimensionality of 4.
 */
@Accessors
@SuppressWarnings("all")
public class Tuple4<T0 extends Object, T1 extends Object, T2 extends Object, T3 extends Object> extends Tuple3<T0, T1, T2> {
  /**
   * The 4th element (element with index 3) of this tuple.
   */
  private final T3 element3;
  
  /**
   * Creates a new tuple with dimensionality 4.
   */
  public Tuple4(final T0 element0, final T1 element1, final T2 element2, final T3 element3) {
    super(element0, element1, element2);
    this.element3 = element3;
  }
  
  /**
   * Returns the dimensionality of this tuple (4).
   * @see Tuple#getDim() Tuple.getDim()
   */
  @Override
  public int getDim() {
    return 4;
  }
  
  @Pure
  public T3 getElement3() {
    return this.element3;
  }
}
