package main;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;
import sib.process.MyelomaClassifierProcessBranch;
import sib.process.MyelomaClassifierProcessSib;
import sib.process.SuccessMyelomaClassifierProcessBranch;

/**
 * If you switched your root process or made changes to its input / output ports
 * and wish to re-generate this class, rename or delete this class and generate again.
 */
@SuppressWarnings("all")
public class Main {
  public static void main(final String[] args) {
    final MyelomaClassifierProcessSib rootProcess = new MyelomaClassifierProcessSib();
    MyelomaClassifierProcessBranch _execute = rootProcess.execute();
    boolean _matched = false;
    if (_execute instanceof SuccessMyelomaClassifierProcessBranch) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("================================");
      _builder.newLine();
      _builder.append("Result: success");
      _builder.newLine();
      _builder.append("================================");
      _builder.newLine();
      InputOutput.<String>println(_builder.toString());
    }
  }
}
