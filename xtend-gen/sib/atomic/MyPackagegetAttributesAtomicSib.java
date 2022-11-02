package sib.atomic;

import myPackage.Result;
import myPackage.getData;
import sib.atomic.AtomicSib;
import sib.atomic.MyPackagegetAttributesAtomicBranch;
import sib.atomic.SuccessMyPackagegetAttributesAtomicBranch;
import tuple.Tuple5;

@SuppressWarnings("all")
public class MyPackagegetAttributesAtomicSib extends AtomicSib {
  public MyPackagegetAttributesAtomicBranch execute(final Result input) {
    final Tuple5<String, Double, String, Double, String> result = getData.getAttributes(input);
    Object _get = result.get(0);
    Object _get_1 = result.get(1);
    Object _get_2 = result.get(2);
    Object _get_3 = result.get(3);
    Object _get_4 = result.get(4);
    return new SuccessMyPackagegetAttributesAtomicBranch(
      ((String) _get), 
      ((Double) _get_1), 
      ((String) _get_2), 
      ((Double) _get_3), 
      ((String) _get_4));
  }
}
