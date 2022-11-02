package sib.process;

import com.google.common.base.Objects;
import java.util.List;
import myPackage.Result;
import sib.Element;
import sib.Sib;
import sib.atomic.CommonBooleanSibIfAtomicBranch;
import sib.atomic.CommonBooleanSibIfAtomicSib;
import sib.atomic.CommonRealSibGreaterOrEqualAtomicBranch;
import sib.atomic.CommonRealSibGreaterOrEqualAtomicSib;
import sib.atomic.CommonRealSibLessOrEqualAtomicBranch;
import sib.atomic.CommonRealSibLessOrEqualAtomicSib;
import sib.atomic.CommonTextSibPrintAtomicBranch;
import sib.atomic.CommonTextSibPrintAtomicSib;
import sib.atomic.FalseCommonBooleanSibIfAtomicBranch;
import sib.atomic.FalseMyPackagetextContainsAtomicBranch;
import sib.atomic.MyPackageResultToStringAtomicBranch;
import sib.atomic.MyPackageResultToStringAtomicSib;
import sib.atomic.MyPackagegetAttributesAtomicBranch;
import sib.atomic.MyPackagegetAttributesAtomicSib;
import sib.atomic.MyPackagegetDataAtomicBranch;
import sib.atomic.MyPackagegetDataAtomicSib;
import sib.atomic.MyPackagesetResultAtomicBranch;
import sib.atomic.MyPackagesetResultAtomicSib;
import sib.atomic.MyPackagetextContainsAtomicBranch;
import sib.atomic.MyPackagetextContainsAtomicSib;
import sib.atomic.SuccessCommonRealSibGreaterOrEqualAtomicBranch;
import sib.atomic.SuccessCommonRealSibLessOrEqualAtomicBranch;
import sib.atomic.SuccessCommonTextSibPrintAtomicBranch;
import sib.atomic.SuccessMyPackageResultToStringAtomicBranch;
import sib.atomic.SuccessMyPackagegetAttributesAtomicBranch;
import sib.atomic.SuccessMyPackagegetDataAtomicBranch;
import sib.atomic.SuccessMyPackagesetResultAtomicBranch;
import sib.atomic.TrueCommonBooleanSibIfAtomicBranch;
import sib.atomic.TrueMyPackagetextContainsAtomicBranch;
import sib.iterate.ExitUnnamed0IterateBranch;
import sib.iterate.NextUnnamed0IterateBranch;
import sib.iterate.Unnamed0IterateBranch;
import sib.iterate.Unnamed0IterateSib;
import sib.process.MyelomaClassifierProcessBranch;
import sib.process.ProcessSib;
import sib.process.SuccessMyelomaClassifierProcessBranch;
import sib.puttocontext.SuccessUnnamed1PutToContextBranch;
import sib.puttocontext.SuccessUnnamed2PutToContextBranch;
import sib.puttocontext.SuccessUnnamed3PutToContextBranch;
import sib.puttocontext.SuccessUnnamed4PutToContextBranch;
import sib.puttocontext.SuccessUnnamed5PutToContextBranch;
import sib.puttocontext.SuccessUnnamed6PutToContextBranch;
import sib.puttocontext.Unnamed1PutToContextBranch;
import sib.puttocontext.Unnamed1PutToContextSib;
import sib.puttocontext.Unnamed2PutToContextBranch;
import sib.puttocontext.Unnamed2PutToContextSib;
import sib.puttocontext.Unnamed3PutToContextBranch;
import sib.puttocontext.Unnamed3PutToContextSib;
import sib.puttocontext.Unnamed4PutToContextBranch;
import sib.puttocontext.Unnamed4PutToContextSib;
import sib.puttocontext.Unnamed5PutToContextBranch;
import sib.puttocontext.Unnamed5PutToContextSib;
import sib.puttocontext.Unnamed6PutToContextBranch;
import sib.puttocontext.Unnamed6PutToContextSib;

@SuppressWarnings("all")
public class MyelomaClassifierProcessSib extends ProcessSib {
  private Result var0_variable;
  
  private Boolean var1_igG;
  
  private String var2_outcome;
  
  private MyPackagegetDataAtomicSib sib3_myPackagegetDataAtomicSib;
  
  private Unnamed0IterateSib sib4_unnamed0IterateSib;
  
  private MyPackagegetAttributesAtomicSib sib5_myPackagegetAttributesAtomicSib;
  
  private MyPackagetextContainsAtomicSib sib6_myPackagetextContainsAtomicSib;
  
  private MyPackagetextContainsAtomicSib sib7_myPackagetextContainsAtomicSib;
  
  private CommonRealSibGreaterOrEqualAtomicSib sib8_commonRealSibGreaterOrEqualAtomicSib;
  
  private CommonBooleanSibIfAtomicSib sib9_commonBooleanSibIfAtomicSib;
  
  private Unnamed1PutToContextSib sib10_unnamed1PutToContextSib;
  
  private Unnamed2PutToContextSib sib11_unnamed2PutToContextSib;
  
  private CommonRealSibGreaterOrEqualAtomicSib sib12_commonRealSibGreaterOrEqualAtomicSib;
  
  private CommonRealSibLessOrEqualAtomicSib sib13_commonRealSibLessOrEqualAtomicSib;
  
  private CommonBooleanSibIfAtomicSib sib14_commonBooleanSibIfAtomicSib;
  
  private CommonBooleanSibIfAtomicSib sib15_commonBooleanSibIfAtomicSib;
  
  private CommonBooleanSibIfAtomicSib sib16_commonBooleanSibIfAtomicSib;
  
  private Unnamed3PutToContextSib sib17_unnamed3PutToContextSib;
  
  private Unnamed4PutToContextSib sib18_unnamed4PutToContextSib;
  
  private CommonRealSibGreaterOrEqualAtomicSib sib19_commonRealSibGreaterOrEqualAtomicSib;
  
  private CommonBooleanSibIfAtomicSib sib20_commonBooleanSibIfAtomicSib;
  
  private CommonRealSibGreaterOrEqualAtomicSib sib21_commonRealSibGreaterOrEqualAtomicSib;
  
  private CommonBooleanSibIfAtomicSib sib22_commonBooleanSibIfAtomicSib;
  
  private Unnamed5PutToContextSib sib23_unnamed5PutToContextSib;
  
  private Unnamed6PutToContextSib sib24_unnamed6PutToContextSib;
  
  private MyPackagesetResultAtomicSib sib25_myPackagesetResultAtomicSib;
  
  private MyPackageResultToStringAtomicSib sib26_myPackageResultToStringAtomicSib;
  
  private CommonTextSibPrintAtomicSib sib27_commonTextSibPrintAtomicSib;
  
  private SuccessMyPackagegetDataAtomicBranch branch28_successMyPackagegetDataAtomicBranch;
  
  private NextUnnamed0IterateBranch branch29_nextUnnamed0IterateBranch;
  
  private ExitUnnamed0IterateBranch branch30_exitUnnamed0IterateBranch;
  
  private SuccessMyPackagegetAttributesAtomicBranch branch31_successMyPackagegetAttributesAtomicBranch;
  
  private TrueMyPackagetextContainsAtomicBranch branch32_trueMyPackagetextContainsAtomicBranch;
  
  private FalseMyPackagetextContainsAtomicBranch branch33_falseMyPackagetextContainsAtomicBranch;
  
  private TrueMyPackagetextContainsAtomicBranch branch34_trueMyPackagetextContainsAtomicBranch;
  
  private FalseMyPackagetextContainsAtomicBranch branch35_falseMyPackagetextContainsAtomicBranch;
  
  private SuccessCommonRealSibGreaterOrEqualAtomicBranch branch36_successCommonRealSibGreaterOrEqualAtomicBranch;
  
  private TrueCommonBooleanSibIfAtomicBranch branch37_trueCommonBooleanSibIfAtomicBranch;
  
  private FalseCommonBooleanSibIfAtomicBranch branch38_falseCommonBooleanSibIfAtomicBranch;
  
  private SuccessUnnamed1PutToContextBranch branch39_successUnnamed1PutToContextBranch;
  
  private SuccessUnnamed2PutToContextBranch branch40_successUnnamed2PutToContextBranch;
  
  private SuccessCommonRealSibGreaterOrEqualAtomicBranch branch41_successCommonRealSibGreaterOrEqualAtomicBranch;
  
  private SuccessCommonRealSibLessOrEqualAtomicBranch branch42_successCommonRealSibLessOrEqualAtomicBranch;
  
  private TrueCommonBooleanSibIfAtomicBranch branch43_trueCommonBooleanSibIfAtomicBranch;
  
  private FalseCommonBooleanSibIfAtomicBranch branch44_falseCommonBooleanSibIfAtomicBranch;
  
  private TrueCommonBooleanSibIfAtomicBranch branch45_trueCommonBooleanSibIfAtomicBranch;
  
  private FalseCommonBooleanSibIfAtomicBranch branch46_falseCommonBooleanSibIfAtomicBranch;
  
  private TrueCommonBooleanSibIfAtomicBranch branch47_trueCommonBooleanSibIfAtomicBranch;
  
  private FalseCommonBooleanSibIfAtomicBranch branch48_falseCommonBooleanSibIfAtomicBranch;
  
  private SuccessUnnamed3PutToContextBranch branch49_successUnnamed3PutToContextBranch;
  
  private SuccessUnnamed4PutToContextBranch branch50_successUnnamed4PutToContextBranch;
  
  private SuccessCommonRealSibGreaterOrEqualAtomicBranch branch51_successCommonRealSibGreaterOrEqualAtomicBranch;
  
  private TrueCommonBooleanSibIfAtomicBranch branch52_trueCommonBooleanSibIfAtomicBranch;
  
  private FalseCommonBooleanSibIfAtomicBranch branch53_falseCommonBooleanSibIfAtomicBranch;
  
  private SuccessCommonRealSibGreaterOrEqualAtomicBranch branch54_successCommonRealSibGreaterOrEqualAtomicBranch;
  
  private TrueCommonBooleanSibIfAtomicBranch branch55_trueCommonBooleanSibIfAtomicBranch;
  
  private FalseCommonBooleanSibIfAtomicBranch branch56_falseCommonBooleanSibIfAtomicBranch;
  
  private SuccessUnnamed5PutToContextBranch branch57_successUnnamed5PutToContextBranch;
  
  private SuccessUnnamed6PutToContextBranch branch58_successUnnamed6PutToContextBranch;
  
  private SuccessMyPackagesetResultAtomicBranch branch59_successMyPackagesetResultAtomicBranch;
  
  private SuccessMyPackageResultToStringAtomicBranch branch60_successMyPackageResultToStringAtomicBranch;
  
  private SuccessCommonTextSibPrintAtomicBranch branch61_successCommonTextSibPrintAtomicBranch;
  
  public MyelomaClassifierProcessBranch execute() {
    MyPackagegetDataAtomicSib _myPackagegetDataAtomicSib = new MyPackagegetDataAtomicSib();
    Element current = this.sib3_myPackagegetDataAtomicSib = _myPackagegetDataAtomicSib;
    while ((current instanceof Sib)) {
      current = this.step(((Sib)current));
    }
    return ((MyelomaClassifierProcessBranch) current);
  }
  
  public Element step(final Sib sib) {
    boolean _matched = false;
    if (sib instanceof MyPackagegetDataAtomicSib) {
      if (Objects.equal(sib, this.sib3_myPackagegetDataAtomicSib)) {
        _matched=true;
        MyPackagegetDataAtomicBranch _execute = ((MyPackagegetDataAtomicSib)sib).execute();
        final MyPackagegetDataAtomicBranch branch = _execute;
        boolean _matched_1 = false;
        if (branch instanceof SuccessMyPackagegetDataAtomicBranch) {
          _matched_1=true;
          this.branch28_successMyPackagegetDataAtomicBranch = ((SuccessMyPackagegetDataAtomicBranch)branch);
          if ((this.sib4_unnamed0IterateSib == null)) {
            Unnamed0IterateSib _unnamed0IterateSib = new Unnamed0IterateSib();
            this.sib4_unnamed0IterateSib = _unnamed0IterateSib;
          }
          return this.sib4_unnamed0IterateSib;
        }
      }
    }
    if (!_matched) {
      if (sib instanceof Unnamed0IterateSib) {
        if (Objects.equal(sib, this.sib4_unnamed0IterateSib)) {
          _matched=true;
          List<Result> _output = null;
          if (this.branch28_successMyPackagegetDataAtomicBranch!=null) {
            _output=this.branch28_successMyPackagegetDataAtomicBranch.getOutput();
          }
          Unnamed0IterateBranch _execute = ((Unnamed0IterateSib)sib).execute(_output);
          final Unnamed0IterateBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof NextUnnamed0IterateBranch) {
            _matched_1=true;
            this.branch29_nextUnnamed0IterateBranch = ((NextUnnamed0IterateBranch)branch);
            Result _element = null;
            if (this.branch29_nextUnnamed0IterateBranch!=null) {
              _element=this.branch29_nextUnnamed0IterateBranch.getElement();
            }
            this.var0_variable = _element;
            if ((this.sib10_unnamed1PutToContextSib == null)) {
              Unnamed1PutToContextSib _unnamed1PutToContextSib = new Unnamed1PutToContextSib();
              this.sib10_unnamed1PutToContextSib = _unnamed1PutToContextSib;
            }
            return this.sib10_unnamed1PutToContextSib;
          }
          if (!_matched_1) {
            if (branch instanceof ExitUnnamed0IterateBranch) {
              _matched_1=true;
              this.branch30_exitUnnamed0IterateBranch = ((ExitUnnamed0IterateBranch)branch);
              return new SuccessMyelomaClassifierProcessBranch();
            }
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof MyPackagegetAttributesAtomicSib) {
        if (Objects.equal(sib, this.sib5_myPackagegetAttributesAtomicSib)) {
          _matched=true;
          MyPackagegetAttributesAtomicBranch _execute = ((MyPackagegetAttributesAtomicSib)sib).execute(this.var0_variable);
          final MyPackagegetAttributesAtomicBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof SuccessMyPackagegetAttributesAtomicBranch) {
            _matched_1=true;
            this.branch31_successMyPackagegetAttributesAtomicBranch = ((SuccessMyPackagegetAttributesAtomicBranch)branch);
            if ((this.sib6_myPackagetextContainsAtomicSib == null)) {
              MyPackagetextContainsAtomicSib _myPackagetextContainsAtomicSib = new MyPackagetextContainsAtomicSib();
              this.sib6_myPackagetextContainsAtomicSib = _myPackagetextContainsAtomicSib;
            }
            return this.sib6_myPackagetextContainsAtomicSib;
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof MyPackagetextContainsAtomicSib) {
        if (Objects.equal(sib, this.sib6_myPackagetextContainsAtomicSib)) {
          _matched=true;
          String _pprot = null;
          if (this.branch31_successMyPackagegetAttributesAtomicBranch!=null) {
            _pprot=this.branch31_successMyPackagegetAttributesAtomicBranch.getPprot();
          }
          MyPackagetextContainsAtomicBranch _execute = ((MyPackagetextContainsAtomicSib)sib).execute("IgG", _pprot);
          final MyPackagetextContainsAtomicBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof TrueMyPackagetextContainsAtomicBranch) {
            _matched_1=true;
            this.branch32_trueMyPackagetextContainsAtomicBranch = ((TrueMyPackagetextContainsAtomicBranch)branch);
            if ((this.sib11_unnamed2PutToContextSib == null)) {
              Unnamed2PutToContextSib _unnamed2PutToContextSib = new Unnamed2PutToContextSib();
              this.sib11_unnamed2PutToContextSib = _unnamed2PutToContextSib;
            }
            return this.sib11_unnamed2PutToContextSib;
          }
          if (!_matched_1) {
            if (branch instanceof FalseMyPackagetextContainsAtomicBranch) {
              _matched_1=true;
              this.branch33_falseMyPackagetextContainsAtomicBranch = ((FalseMyPackagetextContainsAtomicBranch)branch);
              if ((this.sib7_myPackagetextContainsAtomicSib == null)) {
                MyPackagetextContainsAtomicSib _myPackagetextContainsAtomicSib = new MyPackagetextContainsAtomicSib();
                this.sib7_myPackagetextContainsAtomicSib = _myPackagetextContainsAtomicSib;
              }
              return this.sib7_myPackagetextContainsAtomicSib;
            }
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof MyPackagetextContainsAtomicSib) {
        if (Objects.equal(sib, this.sib7_myPackagetextContainsAtomicSib)) {
          _matched=true;
          String _pprot = null;
          if (this.branch31_successMyPackagegetAttributesAtomicBranch!=null) {
            _pprot=this.branch31_successMyPackagegetAttributesAtomicBranch.getPprot();
          }
          MyPackagetextContainsAtomicBranch _execute = ((MyPackagetextContainsAtomicSib)sib).execute("IgA", _pprot);
          final MyPackagetextContainsAtomicBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof TrueMyPackagetextContainsAtomicBranch) {
            _matched_1=true;
            this.branch34_trueMyPackagetextContainsAtomicBranch = ((TrueMyPackagetextContainsAtomicBranch)branch);
            if ((this.sib8_commonRealSibGreaterOrEqualAtomicSib == null)) {
              CommonRealSibGreaterOrEqualAtomicSib _commonRealSibGreaterOrEqualAtomicSib = new CommonRealSibGreaterOrEqualAtomicSib();
              this.sib8_commonRealSibGreaterOrEqualAtomicSib = _commonRealSibGreaterOrEqualAtomicSib;
            }
            return this.sib8_commonRealSibGreaterOrEqualAtomicSib;
          }
          if (!_matched_1) {
            if (branch instanceof FalseMyPackagetextContainsAtomicBranch) {
              _matched_1=true;
              this.branch35_falseMyPackagetextContainsAtomicBranch = ((FalseMyPackagetextContainsAtomicBranch)branch);
              if ((this.sib8_commonRealSibGreaterOrEqualAtomicSib == null)) {
                CommonRealSibGreaterOrEqualAtomicSib _commonRealSibGreaterOrEqualAtomicSib = new CommonRealSibGreaterOrEqualAtomicSib();
                this.sib8_commonRealSibGreaterOrEqualAtomicSib = _commonRealSibGreaterOrEqualAtomicSib;
              }
              return this.sib8_commonRealSibGreaterOrEqualAtomicSib;
            }
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof CommonRealSibGreaterOrEqualAtomicSib) {
        if (Objects.equal(sib, this.sib8_commonRealSibGreaterOrEqualAtomicSib)) {
          _matched=true;
          Double _value = null;
          if (this.branch31_successMyPackagegetAttributesAtomicBranch!=null) {
            _value=this.branch31_successMyPackagegetAttributesAtomicBranch.getValue();
          }
          CommonRealSibGreaterOrEqualAtomicBranch _execute = ((CommonRealSibGreaterOrEqualAtomicSib)sib).execute(_value, Double.valueOf(15.0));
          final CommonRealSibGreaterOrEqualAtomicBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof SuccessCommonRealSibGreaterOrEqualAtomicBranch) {
            _matched_1=true;
            this.branch36_successCommonRealSibGreaterOrEqualAtomicBranch = ((SuccessCommonRealSibGreaterOrEqualAtomicBranch)branch);
            if ((this.sib9_commonBooleanSibIfAtomicSib == null)) {
              CommonBooleanSibIfAtomicSib _commonBooleanSibIfAtomicSib = new CommonBooleanSibIfAtomicSib();
              this.sib9_commonBooleanSibIfAtomicSib = _commonBooleanSibIfAtomicSib;
            }
            return this.sib9_commonBooleanSibIfAtomicSib;
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof CommonBooleanSibIfAtomicSib) {
        if (Objects.equal(sib, this.sib9_commonBooleanSibIfAtomicSib)) {
          _matched=true;
          Boolean _result = null;
          if (this.branch36_successCommonRealSibGreaterOrEqualAtomicBranch!=null) {
            _result=this.branch36_successCommonRealSibGreaterOrEqualAtomicBranch.getResult();
          }
          CommonBooleanSibIfAtomicBranch _execute = ((CommonBooleanSibIfAtomicSib)sib).execute(_result);
          final CommonBooleanSibIfAtomicBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof TrueCommonBooleanSibIfAtomicBranch) {
            _matched_1=true;
            this.branch37_trueCommonBooleanSibIfAtomicBranch = ((TrueCommonBooleanSibIfAtomicBranch)branch);
            if ((this.sib19_commonRealSibGreaterOrEqualAtomicSib == null)) {
              CommonRealSibGreaterOrEqualAtomicSib _commonRealSibGreaterOrEqualAtomicSib = new CommonRealSibGreaterOrEqualAtomicSib();
              this.sib19_commonRealSibGreaterOrEqualAtomicSib = _commonRealSibGreaterOrEqualAtomicSib;
            }
            return this.sib19_commonRealSibGreaterOrEqualAtomicSib;
          }
          if (!_matched_1) {
            if (branch instanceof FalseCommonBooleanSibIfAtomicBranch) {
              _matched_1=true;
              this.branch38_falseCommonBooleanSibIfAtomicBranch = ((FalseCommonBooleanSibIfAtomicBranch)branch);
              if ((this.sib13_commonRealSibLessOrEqualAtomicSib == null)) {
                CommonRealSibLessOrEqualAtomicSib _commonRealSibLessOrEqualAtomicSib = new CommonRealSibLessOrEqualAtomicSib();
                this.sib13_commonRealSibLessOrEqualAtomicSib = _commonRealSibLessOrEqualAtomicSib;
              }
              return this.sib13_commonRealSibLessOrEqualAtomicSib;
            }
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof Unnamed1PutToContextSib) {
        if (Objects.equal(sib, this.sib10_unnamed1PutToContextSib)) {
          _matched=true;
          Unnamed1PutToContextBranch _execute = ((Unnamed1PutToContextSib)sib).execute(Boolean.valueOf(false));
          final Unnamed1PutToContextBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof SuccessUnnamed1PutToContextBranch) {
            _matched_1=true;
            this.branch39_successUnnamed1PutToContextBranch = ((SuccessUnnamed1PutToContextBranch)branch);
            Boolean _reset = null;
            if (this.branch39_successUnnamed1PutToContextBranch!=null) {
              _reset=this.branch39_successUnnamed1PutToContextBranch.getReset();
            }
            this.var1_igG = _reset;
            if ((this.sib5_myPackagegetAttributesAtomicSib == null)) {
              MyPackagegetAttributesAtomicSib _myPackagegetAttributesAtomicSib = new MyPackagegetAttributesAtomicSib();
              this.sib5_myPackagegetAttributesAtomicSib = _myPackagegetAttributesAtomicSib;
            }
            return this.sib5_myPackagegetAttributesAtomicSib;
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof Unnamed2PutToContextSib) {
        if (Objects.equal(sib, this.sib11_unnamed2PutToContextSib)) {
          _matched=true;
          Unnamed2PutToContextBranch _execute = ((Unnamed2PutToContextSib)sib).execute(Boolean.valueOf(true));
          final Unnamed2PutToContextBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof SuccessUnnamed2PutToContextBranch) {
            _matched_1=true;
            this.branch40_successUnnamed2PutToContextBranch = ((SuccessUnnamed2PutToContextBranch)branch);
            Boolean _igGFlag = null;
            if (this.branch40_successUnnamed2PutToContextBranch!=null) {
              _igGFlag=this.branch40_successUnnamed2PutToContextBranch.getIgGFlag();
            }
            this.var1_igG = _igGFlag;
            if ((this.sib8_commonRealSibGreaterOrEqualAtomicSib == null)) {
              CommonRealSibGreaterOrEqualAtomicSib _commonRealSibGreaterOrEqualAtomicSib = new CommonRealSibGreaterOrEqualAtomicSib();
              this.sib8_commonRealSibGreaterOrEqualAtomicSib = _commonRealSibGreaterOrEqualAtomicSib;
            }
            return this.sib8_commonRealSibGreaterOrEqualAtomicSib;
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof CommonRealSibGreaterOrEqualAtomicSib) {
        if (Objects.equal(sib, this.sib12_commonRealSibGreaterOrEqualAtomicSib)) {
          _matched=true;
          Double _slfc = null;
          if (this.branch31_successMyPackagegetAttributesAtomicBranch!=null) {
            _slfc=this.branch31_successMyPackagegetAttributesAtomicBranch.getSlfc();
          }
          CommonRealSibGreaterOrEqualAtomicBranch _execute = ((CommonRealSibGreaterOrEqualAtomicSib)sib).execute(_slfc, Double.valueOf(1.65));
          final CommonRealSibGreaterOrEqualAtomicBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof SuccessCommonRealSibGreaterOrEqualAtomicBranch) {
            _matched_1=true;
            this.branch41_successCommonRealSibGreaterOrEqualAtomicBranch = ((SuccessCommonRealSibGreaterOrEqualAtomicBranch)branch);
            if ((this.sib15_commonBooleanSibIfAtomicSib == null)) {
              CommonBooleanSibIfAtomicSib _commonBooleanSibIfAtomicSib = new CommonBooleanSibIfAtomicSib();
              this.sib15_commonBooleanSibIfAtomicSib = _commonBooleanSibIfAtomicSib;
            }
            return this.sib15_commonBooleanSibIfAtomicSib;
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof CommonRealSibLessOrEqualAtomicSib) {
        if (Objects.equal(sib, this.sib13_commonRealSibLessOrEqualAtomicSib)) {
          _matched=true;
          Double _slfc = null;
          if (this.branch31_successMyPackagegetAttributesAtomicBranch!=null) {
            _slfc=this.branch31_successMyPackagegetAttributesAtomicBranch.getSlfc();
          }
          CommonRealSibLessOrEqualAtomicBranch _execute = ((CommonRealSibLessOrEqualAtomicSib)sib).execute(_slfc, Double.valueOf(0.26));
          final CommonRealSibLessOrEqualAtomicBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof SuccessCommonRealSibLessOrEqualAtomicBranch) {
            _matched_1=true;
            this.branch42_successCommonRealSibLessOrEqualAtomicBranch = ((SuccessCommonRealSibLessOrEqualAtomicBranch)branch);
            if ((this.sib14_commonBooleanSibIfAtomicSib == null)) {
              CommonBooleanSibIfAtomicSib _commonBooleanSibIfAtomicSib = new CommonBooleanSibIfAtomicSib();
              this.sib14_commonBooleanSibIfAtomicSib = _commonBooleanSibIfAtomicSib;
            }
            return this.sib14_commonBooleanSibIfAtomicSib;
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof CommonBooleanSibIfAtomicSib) {
        if (Objects.equal(sib, this.sib14_commonBooleanSibIfAtomicSib)) {
          _matched=true;
          Boolean _result = null;
          if (this.branch42_successCommonRealSibLessOrEqualAtomicBranch!=null) {
            _result=this.branch42_successCommonRealSibLessOrEqualAtomicBranch.getResult();
          }
          CommonBooleanSibIfAtomicBranch _execute = ((CommonBooleanSibIfAtomicSib)sib).execute(_result);
          final CommonBooleanSibIfAtomicBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof TrueCommonBooleanSibIfAtomicBranch) {
            _matched_1=true;
            this.branch43_trueCommonBooleanSibIfAtomicBranch = ((TrueCommonBooleanSibIfAtomicBranch)branch);
            if ((this.sib19_commonRealSibGreaterOrEqualAtomicSib == null)) {
              CommonRealSibGreaterOrEqualAtomicSib _commonRealSibGreaterOrEqualAtomicSib = new CommonRealSibGreaterOrEqualAtomicSib();
              this.sib19_commonRealSibGreaterOrEqualAtomicSib = _commonRealSibGreaterOrEqualAtomicSib;
            }
            return this.sib19_commonRealSibGreaterOrEqualAtomicSib;
          }
          if (!_matched_1) {
            if (branch instanceof FalseCommonBooleanSibIfAtomicBranch) {
              _matched_1=true;
              this.branch44_falseCommonBooleanSibIfAtomicBranch = ((FalseCommonBooleanSibIfAtomicBranch)branch);
              if ((this.sib12_commonRealSibGreaterOrEqualAtomicSib == null)) {
                CommonRealSibGreaterOrEqualAtomicSib _commonRealSibGreaterOrEqualAtomicSib = new CommonRealSibGreaterOrEqualAtomicSib();
                this.sib12_commonRealSibGreaterOrEqualAtomicSib = _commonRealSibGreaterOrEqualAtomicSib;
              }
              return this.sib12_commonRealSibGreaterOrEqualAtomicSib;
            }
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof CommonBooleanSibIfAtomicSib) {
        if (Objects.equal(sib, this.sib15_commonBooleanSibIfAtomicSib)) {
          _matched=true;
          Boolean _result = null;
          if (this.branch41_successCommonRealSibGreaterOrEqualAtomicBranch!=null) {
            _result=this.branch41_successCommonRealSibGreaterOrEqualAtomicBranch.getResult();
          }
          CommonBooleanSibIfAtomicBranch _execute = ((CommonBooleanSibIfAtomicSib)sib).execute(_result);
          final CommonBooleanSibIfAtomicBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof TrueCommonBooleanSibIfAtomicBranch) {
            _matched_1=true;
            this.branch45_trueCommonBooleanSibIfAtomicBranch = ((TrueCommonBooleanSibIfAtomicBranch)branch);
            if ((this.sib19_commonRealSibGreaterOrEqualAtomicSib == null)) {
              CommonRealSibGreaterOrEqualAtomicSib _commonRealSibGreaterOrEqualAtomicSib = new CommonRealSibGreaterOrEqualAtomicSib();
              this.sib19_commonRealSibGreaterOrEqualAtomicSib = _commonRealSibGreaterOrEqualAtomicSib;
            }
            return this.sib19_commonRealSibGreaterOrEqualAtomicSib;
          }
          if (!_matched_1) {
            if (branch instanceof FalseCommonBooleanSibIfAtomicBranch) {
              _matched_1=true;
              this.branch46_falseCommonBooleanSibIfAtomicBranch = ((FalseCommonBooleanSibIfAtomicBranch)branch);
              if ((this.sib16_commonBooleanSibIfAtomicSib == null)) {
                CommonBooleanSibIfAtomicSib _commonBooleanSibIfAtomicSib = new CommonBooleanSibIfAtomicSib();
                this.sib16_commonBooleanSibIfAtomicSib = _commonBooleanSibIfAtomicSib;
              }
              return this.sib16_commonBooleanSibIfAtomicSib;
            }
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof CommonBooleanSibIfAtomicSib) {
        if (Objects.equal(sib, this.sib16_commonBooleanSibIfAtomicSib)) {
          _matched=true;
          CommonBooleanSibIfAtomicBranch _execute = ((CommonBooleanSibIfAtomicSib)sib).execute(this.var1_igG);
          final CommonBooleanSibIfAtomicBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof TrueCommonBooleanSibIfAtomicBranch) {
            _matched_1=true;
            this.branch47_trueCommonBooleanSibIfAtomicBranch = ((TrueCommonBooleanSibIfAtomicBranch)branch);
            if ((this.sib17_unnamed3PutToContextSib == null)) {
              Unnamed3PutToContextSib _unnamed3PutToContextSib = new Unnamed3PutToContextSib();
              this.sib17_unnamed3PutToContextSib = _unnamed3PutToContextSib;
            }
            return this.sib17_unnamed3PutToContextSib;
          }
          if (!_matched_1) {
            if (branch instanceof FalseCommonBooleanSibIfAtomicBranch) {
              _matched_1=true;
              this.branch48_falseCommonBooleanSibIfAtomicBranch = ((FalseCommonBooleanSibIfAtomicBranch)branch);
              if ((this.sib18_unnamed4PutToContextSib == null)) {
                Unnamed4PutToContextSib _unnamed4PutToContextSib = new Unnamed4PutToContextSib();
                this.sib18_unnamed4PutToContextSib = _unnamed4PutToContextSib;
              }
              return this.sib18_unnamed4PutToContextSib;
            }
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof Unnamed3PutToContextSib) {
        if (Objects.equal(sib, this.sib17_unnamed3PutToContextSib)) {
          _matched=true;
          Unnamed3PutToContextBranch _execute = ((Unnamed3PutToContextSib)sib).execute("IgG Monitor annually via GP");
          final Unnamed3PutToContextBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof SuccessUnnamed3PutToContextBranch) {
            _matched_1=true;
            this.branch49_successUnnamed3PutToContextBranch = ((SuccessUnnamed3PutToContextBranch)branch);
            String _input2 = null;
            if (this.branch49_successUnnamed3PutToContextBranch!=null) {
              _input2=this.branch49_successUnnamed3PutToContextBranch.getInput2();
            }
            this.var2_outcome = _input2;
            if ((this.sib25_myPackagesetResultAtomicSib == null)) {
              MyPackagesetResultAtomicSib _myPackagesetResultAtomicSib = new MyPackagesetResultAtomicSib();
              this.sib25_myPackagesetResultAtomicSib = _myPackagesetResultAtomicSib;
            }
            return this.sib25_myPackagesetResultAtomicSib;
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof Unnamed4PutToContextSib) {
        if (Objects.equal(sib, this.sib18_unnamed4PutToContextSib)) {
          _matched=true;
          Unnamed4PutToContextBranch _execute = ((Unnamed4PutToContextSib)sib).execute("IgA Monitor 6 months via GP");
          final Unnamed4PutToContextBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof SuccessUnnamed4PutToContextBranch) {
            _matched_1=true;
            this.branch50_successUnnamed4PutToContextBranch = ((SuccessUnnamed4PutToContextBranch)branch);
            String _input2 = null;
            if (this.branch50_successUnnamed4PutToContextBranch!=null) {
              _input2=this.branch50_successUnnamed4PutToContextBranch.getInput2();
            }
            this.var2_outcome = _input2;
            if ((this.sib25_myPackagesetResultAtomicSib == null)) {
              MyPackagesetResultAtomicSib _myPackagesetResultAtomicSib = new MyPackagesetResultAtomicSib();
              this.sib25_myPackagesetResultAtomicSib = _myPackagesetResultAtomicSib;
            }
            return this.sib25_myPackagesetResultAtomicSib;
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof CommonRealSibGreaterOrEqualAtomicSib) {
        if (Objects.equal(sib, this.sib19_commonRealSibGreaterOrEqualAtomicSib)) {
          _matched=true;
          Double _value = null;
          if (this.branch31_successMyPackagegetAttributesAtomicBranch!=null) {
            _value=this.branch31_successMyPackagegetAttributesAtomicBranch.getValue();
          }
          CommonRealSibGreaterOrEqualAtomicBranch _execute = ((CommonRealSibGreaterOrEqualAtomicSib)sib).execute(_value, Double.valueOf(30.0));
          final CommonRealSibGreaterOrEqualAtomicBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof SuccessCommonRealSibGreaterOrEqualAtomicBranch) {
            _matched_1=true;
            this.branch51_successCommonRealSibGreaterOrEqualAtomicBranch = ((SuccessCommonRealSibGreaterOrEqualAtomicBranch)branch);
            if ((this.sib20_commonBooleanSibIfAtomicSib == null)) {
              CommonBooleanSibIfAtomicSib _commonBooleanSibIfAtomicSib = new CommonBooleanSibIfAtomicSib();
              this.sib20_commonBooleanSibIfAtomicSib = _commonBooleanSibIfAtomicSib;
            }
            return this.sib20_commonBooleanSibIfAtomicSib;
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof CommonBooleanSibIfAtomicSib) {
        if (Objects.equal(sib, this.sib20_commonBooleanSibIfAtomicSib)) {
          _matched=true;
          Boolean _result = null;
          if (this.branch51_successCommonRealSibGreaterOrEqualAtomicBranch!=null) {
            _result=this.branch51_successCommonRealSibGreaterOrEqualAtomicBranch.getResult();
          }
          CommonBooleanSibIfAtomicBranch _execute = ((CommonBooleanSibIfAtomicSib)sib).execute(_result);
          final CommonBooleanSibIfAtomicBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof TrueCommonBooleanSibIfAtomicBranch) {
            _matched_1=true;
            this.branch52_trueCommonBooleanSibIfAtomicBranch = ((TrueCommonBooleanSibIfAtomicBranch)branch);
            if ((this.sib24_unnamed6PutToContextSib == null)) {
              Unnamed6PutToContextSib _unnamed6PutToContextSib = new Unnamed6PutToContextSib();
              this.sib24_unnamed6PutToContextSib = _unnamed6PutToContextSib;
            }
            return this.sib24_unnamed6PutToContextSib;
          }
          if (!_matched_1) {
            if (branch instanceof FalseCommonBooleanSibIfAtomicBranch) {
              _matched_1=true;
              this.branch53_falseCommonBooleanSibIfAtomicBranch = ((FalseCommonBooleanSibIfAtomicBranch)branch);
              if ((this.sib21_commonRealSibGreaterOrEqualAtomicSib == null)) {
                CommonRealSibGreaterOrEqualAtomicSib _commonRealSibGreaterOrEqualAtomicSib = new CommonRealSibGreaterOrEqualAtomicSib();
                this.sib21_commonRealSibGreaterOrEqualAtomicSib = _commonRealSibGreaterOrEqualAtomicSib;
              }
              return this.sib21_commonRealSibGreaterOrEqualAtomicSib;
            }
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof CommonRealSibGreaterOrEqualAtomicSib) {
        if (Objects.equal(sib, this.sib21_commonRealSibGreaterOrEqualAtomicSib)) {
          _matched=true;
          Double _slfc = null;
          if (this.branch31_successMyPackagegetAttributesAtomicBranch!=null) {
            _slfc=this.branch31_successMyPackagegetAttributesAtomicBranch.getSlfc();
          }
          CommonRealSibGreaterOrEqualAtomicBranch _execute = ((CommonRealSibGreaterOrEqualAtomicSib)sib).execute(_slfc, Double.valueOf(100.0));
          final CommonRealSibGreaterOrEqualAtomicBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof SuccessCommonRealSibGreaterOrEqualAtomicBranch) {
            _matched_1=true;
            this.branch54_successCommonRealSibGreaterOrEqualAtomicBranch = ((SuccessCommonRealSibGreaterOrEqualAtomicBranch)branch);
            if ((this.sib22_commonBooleanSibIfAtomicSib == null)) {
              CommonBooleanSibIfAtomicSib _commonBooleanSibIfAtomicSib = new CommonBooleanSibIfAtomicSib();
              this.sib22_commonBooleanSibIfAtomicSib = _commonBooleanSibIfAtomicSib;
            }
            return this.sib22_commonBooleanSibIfAtomicSib;
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof CommonBooleanSibIfAtomicSib) {
        if (Objects.equal(sib, this.sib22_commonBooleanSibIfAtomicSib)) {
          _matched=true;
          Boolean _result = null;
          if (this.branch54_successCommonRealSibGreaterOrEqualAtomicBranch!=null) {
            _result=this.branch54_successCommonRealSibGreaterOrEqualAtomicBranch.getResult();
          }
          CommonBooleanSibIfAtomicBranch _execute = ((CommonBooleanSibIfAtomicSib)sib).execute(_result);
          final CommonBooleanSibIfAtomicBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof TrueCommonBooleanSibIfAtomicBranch) {
            _matched_1=true;
            this.branch55_trueCommonBooleanSibIfAtomicBranch = ((TrueCommonBooleanSibIfAtomicBranch)branch);
            if ((this.sib24_unnamed6PutToContextSib == null)) {
              Unnamed6PutToContextSib _unnamed6PutToContextSib = new Unnamed6PutToContextSib();
              this.sib24_unnamed6PutToContextSib = _unnamed6PutToContextSib;
            }
            return this.sib24_unnamed6PutToContextSib;
          }
          if (!_matched_1) {
            if (branch instanceof FalseCommonBooleanSibIfAtomicBranch) {
              _matched_1=true;
              this.branch56_falseCommonBooleanSibIfAtomicBranch = ((FalseCommonBooleanSibIfAtomicBranch)branch);
              if ((this.sib23_unnamed5PutToContextSib == null)) {
                Unnamed5PutToContextSib _unnamed5PutToContextSib = new Unnamed5PutToContextSib();
                this.sib23_unnamed5PutToContextSib = _unnamed5PutToContextSib;
              }
              return this.sib23_unnamed5PutToContextSib;
            }
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof Unnamed5PutToContextSib) {
        if (Objects.equal(sib, this.sib23_unnamed5PutToContextSib)) {
          _matched=true;
          Unnamed5PutToContextBranch _execute = ((Unnamed5PutToContextSib)sib).execute("Refer To Haematology");
          final Unnamed5PutToContextBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof SuccessUnnamed5PutToContextBranch) {
            _matched_1=true;
            this.branch57_successUnnamed5PutToContextBranch = ((SuccessUnnamed5PutToContextBranch)branch);
            String _input2 = null;
            if (this.branch57_successUnnamed5PutToContextBranch!=null) {
              _input2=this.branch57_successUnnamed5PutToContextBranch.getInput2();
            }
            this.var2_outcome = _input2;
            if ((this.sib25_myPackagesetResultAtomicSib == null)) {
              MyPackagesetResultAtomicSib _myPackagesetResultAtomicSib = new MyPackagesetResultAtomicSib();
              this.sib25_myPackagesetResultAtomicSib = _myPackagesetResultAtomicSib;
            }
            return this.sib25_myPackagesetResultAtomicSib;
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof Unnamed6PutToContextSib) {
        if (Objects.equal(sib, this.sib24_unnamed6PutToContextSib)) {
          _matched=true;
          Unnamed6PutToContextBranch _execute = ((Unnamed6PutToContextSib)sib).execute("Urgent Haematology Referral");
          final Unnamed6PutToContextBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof SuccessUnnamed6PutToContextBranch) {
            _matched_1=true;
            this.branch58_successUnnamed6PutToContextBranch = ((SuccessUnnamed6PutToContextBranch)branch);
            String _input2 = null;
            if (this.branch58_successUnnamed6PutToContextBranch!=null) {
              _input2=this.branch58_successUnnamed6PutToContextBranch.getInput2();
            }
            this.var2_outcome = _input2;
            if ((this.sib25_myPackagesetResultAtomicSib == null)) {
              MyPackagesetResultAtomicSib _myPackagesetResultAtomicSib = new MyPackagesetResultAtomicSib();
              this.sib25_myPackagesetResultAtomicSib = _myPackagesetResultAtomicSib;
            }
            return this.sib25_myPackagesetResultAtomicSib;
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof MyPackagesetResultAtomicSib) {
        if (Objects.equal(sib, this.sib25_myPackagesetResultAtomicSib)) {
          _matched=true;
          MyPackagesetResultAtomicBranch _execute = ((MyPackagesetResultAtomicSib)sib).execute(this.var0_variable, this.var2_outcome);
          final MyPackagesetResultAtomicBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof SuccessMyPackagesetResultAtomicBranch) {
            _matched_1=true;
            this.branch59_successMyPackagesetResultAtomicBranch = ((SuccessMyPackagesetResultAtomicBranch)branch);
            if ((this.sib26_myPackageResultToStringAtomicSib == null)) {
              MyPackageResultToStringAtomicSib _myPackageResultToStringAtomicSib = new MyPackageResultToStringAtomicSib();
              this.sib26_myPackageResultToStringAtomicSib = _myPackageResultToStringAtomicSib;
            }
            return this.sib26_myPackageResultToStringAtomicSib;
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof MyPackageResultToStringAtomicSib) {
        if (Objects.equal(sib, this.sib26_myPackageResultToStringAtomicSib)) {
          _matched=true;
          Result _element = null;
          if (this.branch29_nextUnnamed0IterateBranch!=null) {
            _element=this.branch29_nextUnnamed0IterateBranch.getElement();
          }
          MyPackageResultToStringAtomicBranch _execute = ((MyPackageResultToStringAtomicSib)sib).execute(_element);
          final MyPackageResultToStringAtomicBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof SuccessMyPackageResultToStringAtomicBranch) {
            _matched_1=true;
            this.branch60_successMyPackageResultToStringAtomicBranch = ((SuccessMyPackageResultToStringAtomicBranch)branch);
            if ((this.sib27_commonTextSibPrintAtomicSib == null)) {
              CommonTextSibPrintAtomicSib _commonTextSibPrintAtomicSib = new CommonTextSibPrintAtomicSib();
              this.sib27_commonTextSibPrintAtomicSib = _commonTextSibPrintAtomicSib;
            }
            return this.sib27_commonTextSibPrintAtomicSib;
          }
        }
      }
    }
    if (!_matched) {
      if (sib instanceof CommonTextSibPrintAtomicSib) {
        if (Objects.equal(sib, this.sib27_commonTextSibPrintAtomicSib)) {
          _matched=true;
          String _result = null;
          if (this.branch60_successMyPackageResultToStringAtomicBranch!=null) {
            _result=this.branch60_successMyPackageResultToStringAtomicBranch.getResult();
          }
          CommonTextSibPrintAtomicBranch _execute = ((CommonTextSibPrintAtomicSib)sib).execute(_result);
          final CommonTextSibPrintAtomicBranch branch = _execute;
          boolean _matched_1 = false;
          if (branch instanceof SuccessCommonTextSibPrintAtomicBranch) {
            _matched_1=true;
            this.branch61_successCommonTextSibPrintAtomicBranch = ((SuccessCommonTextSibPrintAtomicBranch)branch);
            if ((this.sib4_unnamed0IterateSib == null)) {
              Unnamed0IterateSib _unnamed0IterateSib = new Unnamed0IterateSib();
              this.sib4_unnamed0IterateSib = _unnamed0IterateSib;
            }
            return this.sib4_unnamed0IterateSib;
          }
        }
      }
    }
    return null;
  }
}
