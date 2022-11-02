package sib.atomic;

import common.BooleanExtension;
import sib.atomic.AtomicSib;
import sib.atomic.CommonBooleanSibIfAtomicBranch;
import sib.atomic.FalseCommonBooleanSibIfAtomicBranch;
import sib.atomic.TrueCommonBooleanSibIfAtomicBranch;

@SuppressWarnings("all")
public class CommonBooleanSibIfAtomicSib extends AtomicSib {
  public CommonBooleanSibIfAtomicBranch execute(final Boolean input) {
    final Boolean result = BooleanExtension.ifSwitch(input);
    if ((result).booleanValue()) {
      return new TrueCommonBooleanSibIfAtomicBranch();
    } else {
      return new FalseCommonBooleanSibIfAtomicBranch();
    }
  }
}
