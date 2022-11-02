package sib.puttocontext;

import sib.puttocontext.PutToContextSib;
import sib.puttocontext.SuccessUnnamed3PutToContextBranch;
import sib.puttocontext.Unnamed3PutToContextBranch;

@SuppressWarnings("all")
public class Unnamed3PutToContextSib extends PutToContextSib {
  public Unnamed3PutToContextBranch execute(final String input2) {
    return new SuccessUnnamed3PutToContextBranch(input2);
  }
}
