package sib.iterate;

import myPackage.Result;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;
import sib.iterate.Unnamed0IterateBranch;

@Data
@SuppressWarnings("all")
public class NextUnnamed0IterateBranch extends Unnamed0IterateBranch {
  private final Result element;
  
  public NextUnnamed0IterateBranch(final Result element) {
    super();
    this.element = element;
  }
  
  @Override
  @Pure
  public int hashCode() {
    return 31 * 1 + ((this.element== null) ? 0 : this.element.hashCode());
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    NextUnnamed0IterateBranch other = (NextUnnamed0IterateBranch) obj;
    if (this.element == null) {
      if (other.element != null)
        return false;
    } else if (!this.element.equals(other.element))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    return new ToStringBuilder(this)
    	.addAllFields()
    	.toString();
  }
  
  @Pure
  public Result getElement() {
    return this.element;
  }
}
