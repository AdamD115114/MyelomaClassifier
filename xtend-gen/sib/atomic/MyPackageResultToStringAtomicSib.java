package sib.atomic;

import myPackage.Result;
import myPackage.getData;
import sib.atomic.AtomicSib;
import sib.atomic.MyPackageResultToStringAtomicBranch;
import sib.atomic.SuccessMyPackageResultToStringAtomicBranch;

@SuppressWarnings("all")
public class MyPackageResultToStringAtomicSib extends AtomicSib {
  public MyPackageResultToStringAtomicBranch execute(final Result input) {
    final String result = getData.toString(input);
    return new SuccessMyPackageResultToStringAtomicBranch(result);
  }
}
