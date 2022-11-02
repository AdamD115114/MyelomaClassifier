package sib.atomic;

import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;
import sib.atomic.CommonRealSibGreaterOrEqualAtomicBranch;
import tuple.Tuple1;

@Data
@SuppressWarnings("all")
public class SuccessCommonRealSibGreaterOrEqualAtomicBranch extends CommonRealSibGreaterOrEqualAtomicBranch {
  private final Boolean result;
  
  public SuccessCommonRealSibGreaterOrEqualAtomicBranch(final Boolean result) {
    this.result = result;
  }
  
  public SuccessCommonRealSibGreaterOrEqualAtomicBranch(final Tuple1<Boolean> tuple) {
    this.result = tuple.getElement0();
  }
  
  @Override
  @Pure
  public int hashCode() {
    return 31 * 1 + ((this.result== null) ? 0 : this.result.hashCode());
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
    SuccessCommonRealSibGreaterOrEqualAtomicBranch other = (SuccessCommonRealSibGreaterOrEqualAtomicBranch) obj;
    if (this.result == null) {
      if (other.result != null)
        return false;
    } else if (!this.result.equals(other.result))
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
  public Boolean getResult() {
    return this.result;
  }
}
