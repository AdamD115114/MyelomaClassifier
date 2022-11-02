package sib.atomic;

import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;
import sib.atomic.MyPackagegetAttributesAtomicBranch;
import tuple.Tuple5;

@Data
@SuppressWarnings("all")
public class SuccessMyPackagegetAttributesAtomicBranch extends MyPackagegetAttributesAtomicBranch {
  private final String iprn;
  
  private final Double slfc;
  
  private final String pprot;
  
  private final Double value;
  
  private final String result;
  
  public SuccessMyPackagegetAttributesAtomicBranch(final String iprn, final Double slfc, final String pprot, final Double value, final String result) {
    this.iprn = iprn;
    this.slfc = slfc;
    this.pprot = pprot;
    this.value = value;
    this.result = result;
  }
  
  public SuccessMyPackagegetAttributesAtomicBranch(final Tuple5<String, Double, String, Double, String> tuple) {
    this.iprn = tuple.getElement0();
    this.slfc = tuple.getElement1();
    this.pprot = tuple.getElement2();
    this.value = tuple.getElement3();
    this.result = tuple.getElement4();
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.iprn== null) ? 0 : this.iprn.hashCode());
    result = prime * result + ((this.slfc== null) ? 0 : this.slfc.hashCode());
    result = prime * result + ((this.pprot== null) ? 0 : this.pprot.hashCode());
    result = prime * result + ((this.value== null) ? 0 : this.value.hashCode());
    return prime * result + ((this.result== null) ? 0 : this.result.hashCode());
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
    SuccessMyPackagegetAttributesAtomicBranch other = (SuccessMyPackagegetAttributesAtomicBranch) obj;
    if (this.iprn == null) {
      if (other.iprn != null)
        return false;
    } else if (!this.iprn.equals(other.iprn))
      return false;
    if (this.slfc == null) {
      if (other.slfc != null)
        return false;
    } else if (!this.slfc.equals(other.slfc))
      return false;
    if (this.pprot == null) {
      if (other.pprot != null)
        return false;
    } else if (!this.pprot.equals(other.pprot))
      return false;
    if (this.value == null) {
      if (other.value != null)
        return false;
    } else if (!this.value.equals(other.value))
      return false;
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
  public String getIprn() {
    return this.iprn;
  }
  
  @Pure
  public Double getSlfc() {
    return this.slfc;
  }
  
  @Pure
  public String getPprot() {
    return this.pprot;
  }
  
  @Pure
  public Double getValue() {
    return this.value;
  }
  
  @Pure
  public String getResult() {
    return this.result;
  }
}
