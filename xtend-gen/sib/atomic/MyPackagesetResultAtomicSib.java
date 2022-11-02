package sib.atomic;

import myPackage.Result;
import myPackage.getData;
import sib.atomic.AtomicSib;
import sib.atomic.MyPackagesetResultAtomicBranch;
import sib.atomic.SuccessMyPackagesetResultAtomicBranch;

@SuppressWarnings("all")
public class MyPackagesetResultAtomicSib extends AtomicSib {
  public MyPackagesetResultAtomicBranch execute(final Result input0, final String input1) {
    getData.setOutcome(input0, input1);
    return new SuccessMyPackagesetResultAtomicBranch();
  }
}
