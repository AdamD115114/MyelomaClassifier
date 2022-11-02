package sib.atomic;

import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;
import sib.atomic.MyPackageResultToStringAtomicBranch;
import tuple.Tuple1;

@Data
@SuppressWarnings("all")
public class SuccessMyPackageResultToStringAtomicBranch extends MyPackageResultToStringAtomicBranch {
  private final String result;
  
  public SuccessMyPackageResultToStringAtomicBranch(final String result) {
    this.result = result;
  }
  
  public SuccessMyPackageResultToStringAtomicBranch(final Tuple1<String> tuple) {
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
    SuccessMyPackageResultToStringAtomicBranch other = (SuccessMyPackageResultToStringAtomicBranch) obj;
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
  public String getResult() {
    return this.result;
  }
}
