package sib.puttocontext;

import sib.puttocontext.PutToContextSib;
import sib.puttocontext.SuccessUnnamed2PutToContextBranch;
import sib.puttocontext.Unnamed2PutToContextBranch;

@SuppressWarnings("all")
public class Unnamed2PutToContextSib extends PutToContextSib {
  public Unnamed2PutToContextBranch execute(final Boolean igGFlag) {
    return new SuccessUnnamed2PutToContextBranch(igGFlag);
  }
}
