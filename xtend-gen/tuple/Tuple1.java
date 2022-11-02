package tuple;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import tuple.Tuple;

/**
 * A concrete class for tuples with a dimensionality of 1.
 */
@Accessors
@SuppressWarnings("all")
public class Tuple1<T0 extends Object> extends Tuple {
  /**
   * The 1st element (element with index 0) of this tuple.
   */
  private final T0 element0;
  
  /**
   * Creates a new tuple with dimensionality 1.
   */
  public Tuple1(final T0 element0) {
    super();
    this.element0 = element0;
  }
  
  /**
   * Returns the dimensionality of this tuple (1).
   * @see Tuple#getDim() Tuple.getDim()
   */
  @Override
  public int getDim() {
    return 1;
  }
  
  @Pure
  public T0 getElement0() {
    return this.element0;
  }
}
