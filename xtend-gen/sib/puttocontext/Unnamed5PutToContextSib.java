package sib.puttocontext;

import sib.puttocontext.PutToContextSib;
import sib.puttocontext.SuccessUnnamed5PutToContextBranch;
import sib.puttocontext.Unnamed5PutToContextBranch;

@SuppressWarnings("all")
public class Unnamed5PutToContextSib extends PutToContextSib {
  public Unnamed5PutToContextBranch execute(final String input2) {
    return new SuccessUnnamed5PutToContextBranch(input2);
  }
}
