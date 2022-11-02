package sib.process;

import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;
import sib.process.MyelomaClassifierProcessBranch;

@Data
@SuppressWarnings("all")
public class SuccessMyelomaClassifierProcessBranch extends MyelomaClassifierProcessBranch {
  @Override
  @Pure
  public int hashCode() {
    return 1;
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
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    return new ToStringBuilder(this)
    	.addAllFields()
    	.toString();
  }
}
