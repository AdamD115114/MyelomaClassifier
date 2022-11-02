package sib.atomic;

import java.util.List;
import myPackage.Result;
import myPackage.getData;
import sib.atomic.AtomicSib;
import sib.atomic.MyPackagegetDataAtomicBranch;
import sib.atomic.SuccessMyPackagegetDataAtomicBranch;

@SuppressWarnings("all")
public class MyPackagegetDataAtomicSib extends AtomicSib {
  public MyPackagegetDataAtomicBranch execute() {
    final List<Result> result = getData.getMockData();
    return new SuccessMyPackagegetDataAtomicBranch(result);
  }
}
