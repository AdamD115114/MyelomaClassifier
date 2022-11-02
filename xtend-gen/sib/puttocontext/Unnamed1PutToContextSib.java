package sib.puttocontext;

import sib.puttocontext.PutToContextSib;
import sib.puttocontext.SuccessUnnamed1PutToContextBranch;
import sib.puttocontext.Unnamed1PutToContextBranch;

@SuppressWarnings("all")
public class Unnamed1PutToContextSib extends PutToContextSib {
  public Unnamed1PutToContextBranch execute(final Boolean reset) {
    return new SuccessUnnamed1PutToContextBranch(reset);
  }
}
