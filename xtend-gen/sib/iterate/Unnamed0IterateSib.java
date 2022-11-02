package sib.iterate;

import java.util.Iterator;
import java.util.List;
import myPackage.Result;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import sib.iterate.ExitUnnamed0IterateBranch;
import sib.iterate.IterateSib;
import sib.iterate.NextUnnamed0IterateBranch;
import sib.iterate.Unnamed0IterateBranch;

@SuppressWarnings("all")
public class Unnamed0IterateSib extends IterateSib {
  private Iterator<Result> iterator;
  
  public Unnamed0IterateBranch execute(final List<Result> list) {
    if ((this.iterator == null)) {
      boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(list);
      if (_isNullOrEmpty) {
        return new ExitUnnamed0IterateBranch();
      }
      this.iterator = list.iterator();
    }
    boolean _hasNext = this.iterator.hasNext();
    if (_hasNext) {
      Result _next = this.iterator.next();
      return new NextUnnamed0IterateBranch(_next);
    } else {
      this.iterator = null;
      return new ExitUnnamed0IterateBranch();
    }
  }
}
