package tuple;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import tuple.Tuple2;

/**
 * A concrete class for tuples with a dimensionality of 3.
 */
@Accessors
@SuppressWarnings("all")
public class Tuple3<T0 extends Object, T1 extends Object, T2 extends Object> extends Tuple2<T0, T1> {
  /**
   * The 3rd element (element with index 2) of this tuple.
   */
  private final T2 element2;
  
  /**
   * Creates a new tuple with dimensionality 3.
   */
  public Tuple3(final T0 element0, final T1 element1, final T2 element2) {
    super(element0, element1);
    this.element2 = element2;
  }
  
  /**
   * Returns the dimensionality of this tuple (3).
   * @see Tuple#getDim() Tuple.getDim()
   */
  @Override
  public int getDim() {
    return 3;
  }
  
  @Pure
  public T2 getElement2() {
    return this.element2;
  }
}
