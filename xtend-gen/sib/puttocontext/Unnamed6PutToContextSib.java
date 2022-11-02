package sib.puttocontext;

import sib.puttocontext.PutToContextSib;
import sib.puttocontext.SuccessUnnamed6PutToContextBranch;
import sib.puttocontext.Unnamed6PutToContextBranch;

@SuppressWarnings("all")
public class Unnamed6PutToContextSib extends PutToContextSib {
  public Unnamed6PutToContextBranch execute(final String input2) {
    return new SuccessUnnamed6PutToContextBranch(input2);
  }
}
