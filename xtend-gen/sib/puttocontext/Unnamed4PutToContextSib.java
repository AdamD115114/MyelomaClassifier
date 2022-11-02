package sib.puttocontext;

import sib.puttocontext.PutToContextSib;
import sib.puttocontext.SuccessUnnamed4PutToContextBranch;
import sib.puttocontext.Unnamed4PutToContextBranch;

@SuppressWarnings("all")
public class Unnamed4PutToContextSib extends PutToContextSib {
  public Unnamed4PutToContextBranch execute(final String input2) {
    return new SuccessUnnamed4PutToContextBranch(input2);
  }
}
