package sib.puttocontext;

import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;
import sib.puttocontext.Unnamed5PutToContextBranch;

@Data
@SuppressWarnings("all")
public class SuccessUnnamed5PutToContextBranch extends Unnamed5PutToContextBranch {
  private final String input2;
  
  public SuccessUnnamed5PutToContextBranch(final String input2) {
    super();
    this.input2 = input2;
  }
  
  @Override
  @Pure
  public int hashCode() {
    return 31 * 1 + ((this.input2== null) ? 0 : this.input2.hashCode());
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
    SuccessUnnamed5PutToContextBranch other = (SuccessUnnamed5PutToContextBranch) obj;
    if (this.input2 == null) {
      if (other.input2 != null)
        return false;
    } else if (!this.input2.equals(other.input2))
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
  public String getInput2() {
    return this.input2;
  }
}
