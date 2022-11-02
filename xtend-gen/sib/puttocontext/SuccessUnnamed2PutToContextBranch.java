package sib.puttocontext;

import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;
import sib.puttocontext.Unnamed2PutToContextBranch;

@Data
@SuppressWarnings("all")
public class SuccessUnnamed2PutToContextBranch extends Unnamed2PutToContextBranch {
  private final Boolean igGFlag;
  
  public SuccessUnnamed2PutToContextBranch(final Boolean igGFlag) {
    super();
    this.igGFlag = igGFlag;
  }
  
  @Override
  @Pure
  public int hashCode() {
    return 31 * 1 + ((this.igGFlag== null) ? 0 : this.igGFlag.hashCode());
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
    SuccessUnnamed2PutToContextBranch other = (SuccessUnnamed2PutToContextBranch) obj;
    if (this.igGFlag == null) {
      if (other.igGFlag != null)
        return false;
    } else if (!this.igGFlag.equals(other.igGFlag))
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
  public Boolean getIgGFlag() {
    return this.igGFlag;
  }
}
