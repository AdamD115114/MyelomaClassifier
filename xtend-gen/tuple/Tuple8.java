package tuple;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import tuple.Tuple7;

/**
 * A concrete class for tuples with a dimensionality of 8.
 */
@Accessors
@SuppressWarnings("all")
public class Tuple8<T0 extends Object, T1 extends Object, T2 extends Object, T3 extends Object, T4 extends Object, T5 extends Object, T6 extends Object, T7 extends Object> extends Tuple7<T0, T1, T2, T3, T4, T5, T6> {
  /**
   * The 8th element (element with index 7) of this tuple.
   */
  private final T7 element7;
  
  /**
   * Creates a new tuple with dimensionality 8.
   */
  public Tuple8(final T0 element0, final T1 element1, final T2 element2, final T3 element3, final T4 element4, final T5 element5, final T6 element6, final T7 element7) {
    super(element0, element1, element2, element3, element4, element5, element6);
    this.element7 = element7;
  }
  
  /**
   * Returns the dimensionality of this tuple (8).
   * @see Tuple#getDim() Tuple.getDim()
   */
  @Override
  public int getDim() {
    return 8;
  }
  
  @Pure
  public T7 getElement7() {
    return this.element7;
  }
}
