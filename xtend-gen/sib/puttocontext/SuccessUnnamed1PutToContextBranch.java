package sib.puttocontext;

import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;
import sib.puttocontext.Unnamed1PutToContextBranch;

@Data
@SuppressWarnings("all")
public class SuccessUnnamed1PutToContextBranch extends Unnamed1PutToContextBranch {
  private final Boolean reset;
  
  public SuccessUnnamed1PutToContextBranch(final Boolean reset) {
    super();
    this.reset = reset;
  }
  
  @Override
  @Pure
  public int hashCode() {
    return 31 * 1 + ((this.reset== null) ? 0 : this.reset.hashCode());
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
    SuccessUnnamed1PutToContextBranch other = (SuccessUnnamed1PutToContextBranch) obj;
    if (this.reset == null) {
      if (other.reset != null)
        return false;
    } else if (!this.reset.equals(other.reset))
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
  public Boolean getReset() {
    return this.reset;
  }
}
