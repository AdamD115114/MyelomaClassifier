package sib.atomic;

import common.DoubleExtension;
import sib.atomic.AtomicSib;
import sib.atomic.CommonRealSibLessOrEqualAtomicBranch;
import sib.atomic.SuccessCommonRealSibLessOrEqualAtomicBranch;

@SuppressWarnings("all")
public class CommonRealSibLessOrEqualAtomicSib extends AtomicSib {
  public CommonRealSibLessOrEqualAtomicBranch execute(final Double input1, final Double input2) {
    final Boolean result = DoubleExtension.lessOrEqual(input1, input2);
    return new SuccessCommonRealSibLessOrEqualAtomicBranch(result);
  }
}
