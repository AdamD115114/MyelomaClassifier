package tuple;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import tuple.Tuple1;

/**
 * A concrete class for tuples with a dimensionality of 2.
 */
@Accessors
@SuppressWarnings("all")
public class Tuple2<T0 extends Object, T1 extends Object> extends Tuple1<T0> {
  /**
   * The 2nd element (element with index 1) of this tuple.
   */
  private final T1 element1;
  
  /**
   * Creates a new tuple with dimensionality 2.
   */
  public Tuple2(final T0 element0, final T1 element1) {
    super(element0);
    this.element1 = element1;
  }
  
  /**
   * Returns the dimensionality of this tuple (2).
   * @see Tuple#getDim() Tuple.getDim()
   */
  @Override
  public int getDim() {
    return 2;
  }
  
  @Pure
  public T1 getElement1() {
    return this.element1;
  }
}
