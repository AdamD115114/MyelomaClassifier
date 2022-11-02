package sib.atomic;

import myPackage.textExt;
import sib.atomic.AtomicSib;
import sib.atomic.FalseMyPackagetextContainsAtomicBranch;
import sib.atomic.MyPackagetextContainsAtomicBranch;
import sib.atomic.TrueMyPackagetextContainsAtomicBranch;

@SuppressWarnings("all")
public class MyPackagetextContainsAtomicSib extends AtomicSib {
  public MyPackagetextContainsAtomicBranch execute(final String input, final String needle) {
    final boolean result = textExt.contains(input, needle);
    if (result) {
      return new TrueMyPackagetextContainsAtomicBranch();
    } else {
      return new FalseMyPackagetextContainsAtomicBranch();
    }
  }
}
