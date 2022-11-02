package sib.atomic;

import common.DoubleExtension;
import sib.atomic.AtomicSib;
import sib.atomic.CommonRealSibGreaterOrEqualAtomicBranch;
import sib.atomic.SuccessCommonRealSibGreaterOrEqualAtomicBranch;

@SuppressWarnings("all")
public class CommonRealSibGreaterOrEqualAtomicSib extends AtomicSib {
  public CommonRealSibGreaterOrEqualAtomicBranch execute(final Double input1, final Double input2) {
    final Boolean result = DoubleExtension.greaterOrEqual(input1, input2);
    return new SuccessCommonRealSibGreaterOrEqualAtomicBranch(result);
  }
}
