package sib.atomic;

import java.util.List;
import myPackage.Result;
import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;
import sib.atomic.MyPackagegetDataAtomicBranch;
import tuple.Tuple1;

@Data
@SuppressWarnings("all")
public class SuccessMyPackagegetDataAtomicBranch extends MyPackagegetDataAtomicBranch {
  private final List<Result> output;
  
  public SuccessMyPackagegetDataAtomicBranch(final List<Result> output) {
    this.output = output;
  }
  
  public SuccessMyPackagegetDataAtomicBranch(final Tuple1<List<Result>> tuple) {
    this.output = tuple.getElement0();
  }
  
  @Override
  @Pure
  public int hashCode() {
    return 31 * 1 + ((this.output== null) ? 0 : this.output.hashCode());
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
    SuccessMyPackagegetDataAtomicBranch other = (SuccessMyPackagegetDataAtomicBranch) obj;
    if (this.output == null) {
      if (other.output != null)
        return false;
    } else if (!this.output.equals(other.output))
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
  public List<Result> getOutput() {
    return this.output;
  }
}
