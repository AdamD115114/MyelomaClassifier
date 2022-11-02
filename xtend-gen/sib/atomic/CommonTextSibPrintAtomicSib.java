package sib.atomic;

import common.StringExtension;
import sib.atomic.AtomicSib;
import sib.atomic.CommonTextSibPrintAtomicBranch;
import sib.atomic.SuccessCommonTextSibPrintAtomicBranch;

@SuppressWarnings("all")
public class CommonTextSibPrintAtomicSib extends AtomicSib {
  public CommonTextSibPrintAtomicBranch execute(final String input) {
    StringExtension.print(input);
    return new SuccessCommonTextSibPrintAtomicBranch();
  }
}
