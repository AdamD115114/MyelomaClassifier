// Generated by info.scce.cinco.product.minidime.generator.sib.process.ProcessSibGenerator
	
package sib.process

import myPackage.Result
import sib.Element
import sib.Sib
import sib.atomic.CommonBooleanSibIfAtomicSib
import sib.atomic.CommonRealSibGreaterOrEqualAtomicSib
import sib.atomic.CommonRealSibLessOrEqualAtomicSib
import sib.atomic.CommonTextSibPrintAtomicSib
import sib.atomic.FalseCommonBooleanSibIfAtomicBranch
import sib.atomic.FalseMyPackagetextContainsAtomicBranch
import sib.atomic.MyPackageResultToStringAtomicSib
import sib.atomic.MyPackagegetAttributesAtomicSib
import sib.atomic.MyPackagegetDataAtomicSib
import sib.atomic.MyPackagesetResultAtomicSib
import sib.atomic.MyPackagetextContainsAtomicSib
import sib.atomic.SuccessCommonRealSibGreaterOrEqualAtomicBranch
import sib.atomic.SuccessCommonRealSibLessOrEqualAtomicBranch
import sib.atomic.SuccessCommonTextSibPrintAtomicBranch
import sib.atomic.SuccessMyPackageResultToStringAtomicBranch
import sib.atomic.SuccessMyPackagegetAttributesAtomicBranch
import sib.atomic.SuccessMyPackagegetDataAtomicBranch
import sib.atomic.SuccessMyPackagesetResultAtomicBranch
import sib.atomic.TrueCommonBooleanSibIfAtomicBranch
import sib.atomic.TrueMyPackagetextContainsAtomicBranch
import sib.iterate.ExitUnnamed0IterateBranch
import sib.iterate.NextUnnamed0IterateBranch
import sib.iterate.Unnamed0IterateSib
import sib.puttocontext.SuccessUnnamed1PutToContextBranch
import sib.puttocontext.SuccessUnnamed2PutToContextBranch
import sib.puttocontext.SuccessUnnamed3PutToContextBranch
import sib.puttocontext.SuccessUnnamed4PutToContextBranch
import sib.puttocontext.SuccessUnnamed5PutToContextBranch
import sib.puttocontext.SuccessUnnamed6PutToContextBranch
import sib.puttocontext.Unnamed1PutToContextSib
import sib.puttocontext.Unnamed2PutToContextSib
import sib.puttocontext.Unnamed3PutToContextSib
import sib.puttocontext.Unnamed4PutToContextSib
import sib.puttocontext.Unnamed5PutToContextSib
import sib.puttocontext.Unnamed6PutToContextSib

class MyelomaClassifierProcessSib extends ProcessSib {
	
	// Variables
	var Result var0_variable
	var Boolean var1_igG
	var String var2_outcome
	
	// Sibs
	var MyPackagegetDataAtomicSib sib3_myPackagegetDataAtomicSib
	var Unnamed0IterateSib sib4_unnamed0IterateSib
	var MyPackagegetAttributesAtomicSib sib5_myPackagegetAttributesAtomicSib
	var MyPackagetextContainsAtomicSib sib6_myPackagetextContainsAtomicSib
	var MyPackagetextContainsAtomicSib sib7_myPackagetextContainsAtomicSib
	var CommonRealSibGreaterOrEqualAtomicSib sib8_commonRealSibGreaterOrEqualAtomicSib
	var CommonBooleanSibIfAtomicSib sib9_commonBooleanSibIfAtomicSib
	var Unnamed1PutToContextSib sib10_unnamed1PutToContextSib
	var Unnamed2PutToContextSib sib11_unnamed2PutToContextSib
	var CommonRealSibGreaterOrEqualAtomicSib sib12_commonRealSibGreaterOrEqualAtomicSib
	var CommonRealSibLessOrEqualAtomicSib sib13_commonRealSibLessOrEqualAtomicSib
	var CommonBooleanSibIfAtomicSib sib14_commonBooleanSibIfAtomicSib
	var CommonBooleanSibIfAtomicSib sib15_commonBooleanSibIfAtomicSib
	var CommonBooleanSibIfAtomicSib sib16_commonBooleanSibIfAtomicSib
	var Unnamed3PutToContextSib sib17_unnamed3PutToContextSib
	var Unnamed4PutToContextSib sib18_unnamed4PutToContextSib
	var CommonRealSibGreaterOrEqualAtomicSib sib19_commonRealSibGreaterOrEqualAtomicSib
	var CommonBooleanSibIfAtomicSib sib20_commonBooleanSibIfAtomicSib
	var CommonRealSibGreaterOrEqualAtomicSib sib21_commonRealSibGreaterOrEqualAtomicSib
	var CommonBooleanSibIfAtomicSib sib22_commonBooleanSibIfAtomicSib
	var Unnamed5PutToContextSib sib23_unnamed5PutToContextSib
	var Unnamed6PutToContextSib sib24_unnamed6PutToContextSib
	var MyPackagesetResultAtomicSib sib25_myPackagesetResultAtomicSib
	var MyPackageResultToStringAtomicSib sib26_myPackageResultToStringAtomicSib
	var CommonTextSibPrintAtomicSib sib27_commonTextSibPrintAtomicSib
	
	// Branches
	var SuccessMyPackagegetDataAtomicBranch branch28_successMyPackagegetDataAtomicBranch
	var NextUnnamed0IterateBranch branch29_nextUnnamed0IterateBranch
	var ExitUnnamed0IterateBranch branch30_exitUnnamed0IterateBranch
	var SuccessMyPackagegetAttributesAtomicBranch branch31_successMyPackagegetAttributesAtomicBranch
	var TrueMyPackagetextContainsAtomicBranch branch32_trueMyPackagetextContainsAtomicBranch
	var FalseMyPackagetextContainsAtomicBranch branch33_falseMyPackagetextContainsAtomicBranch
	var TrueMyPackagetextContainsAtomicBranch branch34_trueMyPackagetextContainsAtomicBranch
	var FalseMyPackagetextContainsAtomicBranch branch35_falseMyPackagetextContainsAtomicBranch
	var SuccessCommonRealSibGreaterOrEqualAtomicBranch branch36_successCommonRealSibGreaterOrEqualAtomicBranch
	var TrueCommonBooleanSibIfAtomicBranch branch37_trueCommonBooleanSibIfAtomicBranch
	var FalseCommonBooleanSibIfAtomicBranch branch38_falseCommonBooleanSibIfAtomicBranch
	var SuccessUnnamed1PutToContextBranch branch39_successUnnamed1PutToContextBranch
	var SuccessUnnamed2PutToContextBranch branch40_successUnnamed2PutToContextBranch
	var SuccessCommonRealSibGreaterOrEqualAtomicBranch branch41_successCommonRealSibGreaterOrEqualAtomicBranch
	var SuccessCommonRealSibLessOrEqualAtomicBranch branch42_successCommonRealSibLessOrEqualAtomicBranch
	var TrueCommonBooleanSibIfAtomicBranch branch43_trueCommonBooleanSibIfAtomicBranch
	var FalseCommonBooleanSibIfAtomicBranch branch44_falseCommonBooleanSibIfAtomicBranch
	var TrueCommonBooleanSibIfAtomicBranch branch45_trueCommonBooleanSibIfAtomicBranch
	var FalseCommonBooleanSibIfAtomicBranch branch46_falseCommonBooleanSibIfAtomicBranch
	var TrueCommonBooleanSibIfAtomicBranch branch47_trueCommonBooleanSibIfAtomicBranch
	var FalseCommonBooleanSibIfAtomicBranch branch48_falseCommonBooleanSibIfAtomicBranch
	var SuccessUnnamed3PutToContextBranch branch49_successUnnamed3PutToContextBranch
	var SuccessUnnamed4PutToContextBranch branch50_successUnnamed4PutToContextBranch
	var SuccessCommonRealSibGreaterOrEqualAtomicBranch branch51_successCommonRealSibGreaterOrEqualAtomicBranch
	var TrueCommonBooleanSibIfAtomicBranch branch52_trueCommonBooleanSibIfAtomicBranch
	var FalseCommonBooleanSibIfAtomicBranch branch53_falseCommonBooleanSibIfAtomicBranch
	var SuccessCommonRealSibGreaterOrEqualAtomicBranch branch54_successCommonRealSibGreaterOrEqualAtomicBranch
	var TrueCommonBooleanSibIfAtomicBranch branch55_trueCommonBooleanSibIfAtomicBranch
	var FalseCommonBooleanSibIfAtomicBranch branch56_falseCommonBooleanSibIfAtomicBranch
	var SuccessUnnamed5PutToContextBranch branch57_successUnnamed5PutToContextBranch
	var SuccessUnnamed6PutToContextBranch branch58_successUnnamed6PutToContextBranch
	var SuccessMyPackagesetResultAtomicBranch branch59_successMyPackagesetResultAtomicBranch
	var SuccessMyPackageResultToStringAtomicBranch branch60_successMyPackageResultToStringAtomicBranch
	var SuccessCommonTextSibPrintAtomicBranch branch61_successCommonTextSibPrintAtomicBranch
	
	// Execute method
	def MyelomaClassifierProcessBranch execute() {
		
		// Set initial variable values
		
		// Execution loop
		var Element current = sib3_myPackagegetDataAtomicSib = new MyPackagegetDataAtomicSib
		while (current instanceof Sib) {
			current = current.step
		}
		return current as MyelomaClassifierProcessBranch
		
	}
	
	def Element step(Sib sib) {
			
		switch sib {
			
			MyPackagegetDataAtomicSib case sib3_myPackagegetDataAtomicSib: {
				switch branch : sib.execute {
					SuccessMyPackagegetDataAtomicBranch: {
						branch28_successMyPackagegetDataAtomicBranch = branch
						if (sib4_unnamed0IterateSib === null) {
							sib4_unnamed0IterateSib = new Unnamed0IterateSib
						}
						return sib4_unnamed0IterateSib
					}
				}
			}
			
			Unnamed0IterateSib case sib4_unnamed0IterateSib: {
				switch branch : sib.execute(branch28_successMyPackagegetDataAtomicBranch?.output) {
					NextUnnamed0IterateBranch: {
						branch29_nextUnnamed0IterateBranch = branch
						var0_variable = branch29_nextUnnamed0IterateBranch?.element
						if (sib10_unnamed1PutToContextSib === null) {
							sib10_unnamed1PutToContextSib = new Unnamed1PutToContextSib
						}
						return sib10_unnamed1PutToContextSib
					}
					ExitUnnamed0IterateBranch: {
						branch30_exitUnnamed0IterateBranch = branch
						return new SuccessMyelomaClassifierProcessBranch
					}
				}
			}
			
			MyPackagegetAttributesAtomicSib case sib5_myPackagegetAttributesAtomicSib: {
				switch branch : sib.execute(var0_variable) {
					SuccessMyPackagegetAttributesAtomicBranch: {
						branch31_successMyPackagegetAttributesAtomicBranch = branch
						if (sib6_myPackagetextContainsAtomicSib === null) {
							sib6_myPackagetextContainsAtomicSib = new MyPackagetextContainsAtomicSib
						}
						return sib6_myPackagetextContainsAtomicSib
					}
				}
			}
			
			MyPackagetextContainsAtomicSib case sib6_myPackagetextContainsAtomicSib: {
				switch branch : sib.execute('IgG', branch31_successMyPackagegetAttributesAtomicBranch?.pprot) {
					TrueMyPackagetextContainsAtomicBranch: {
						branch32_trueMyPackagetextContainsAtomicBranch = branch
						if (sib11_unnamed2PutToContextSib === null) {
							sib11_unnamed2PutToContextSib = new Unnamed2PutToContextSib
						}
						return sib11_unnamed2PutToContextSib
					}
					FalseMyPackagetextContainsAtomicBranch: {
						branch33_falseMyPackagetextContainsAtomicBranch = branch
						if (sib7_myPackagetextContainsAtomicSib === null) {
							sib7_myPackagetextContainsAtomicSib = new MyPackagetextContainsAtomicSib
						}
						return sib7_myPackagetextContainsAtomicSib
					}
				}
			}
			
			MyPackagetextContainsAtomicSib case sib7_myPackagetextContainsAtomicSib: {
				switch branch : sib.execute('IgA', branch31_successMyPackagegetAttributesAtomicBranch?.pprot) {
					TrueMyPackagetextContainsAtomicBranch: {
						branch34_trueMyPackagetextContainsAtomicBranch = branch
						if (sib8_commonRealSibGreaterOrEqualAtomicSib === null) {
							sib8_commonRealSibGreaterOrEqualAtomicSib = new CommonRealSibGreaterOrEqualAtomicSib
						}
						return sib8_commonRealSibGreaterOrEqualAtomicSib
					}
					FalseMyPackagetextContainsAtomicBranch: {
						branch35_falseMyPackagetextContainsAtomicBranch = branch
						if (sib8_commonRealSibGreaterOrEqualAtomicSib === null) {
							sib8_commonRealSibGreaterOrEqualAtomicSib = new CommonRealSibGreaterOrEqualAtomicSib
						}
						return sib8_commonRealSibGreaterOrEqualAtomicSib
					}
				}
			}
			
			CommonRealSibGreaterOrEqualAtomicSib case sib8_commonRealSibGreaterOrEqualAtomicSib: {
				switch branch : sib.execute(branch31_successMyPackagegetAttributesAtomicBranch?.value, 15.0) {
					SuccessCommonRealSibGreaterOrEqualAtomicBranch: {
						branch36_successCommonRealSibGreaterOrEqualAtomicBranch = branch
						if (sib9_commonBooleanSibIfAtomicSib === null) {
							sib9_commonBooleanSibIfAtomicSib = new CommonBooleanSibIfAtomicSib
						}
						return sib9_commonBooleanSibIfAtomicSib
					}
				}
			}
			
			CommonBooleanSibIfAtomicSib case sib9_commonBooleanSibIfAtomicSib: {
				switch branch : sib.execute(branch36_successCommonRealSibGreaterOrEqualAtomicBranch?.result) {
					TrueCommonBooleanSibIfAtomicBranch: {
						branch37_trueCommonBooleanSibIfAtomicBranch = branch
						if (sib19_commonRealSibGreaterOrEqualAtomicSib === null) {
							sib19_commonRealSibGreaterOrEqualAtomicSib = new CommonRealSibGreaterOrEqualAtomicSib
						}
						return sib19_commonRealSibGreaterOrEqualAtomicSib
					}
					FalseCommonBooleanSibIfAtomicBranch: {
						branch38_falseCommonBooleanSibIfAtomicBranch = branch
						if (sib13_commonRealSibLessOrEqualAtomicSib === null) {
							sib13_commonRealSibLessOrEqualAtomicSib = new CommonRealSibLessOrEqualAtomicSib
						}
						return sib13_commonRealSibLessOrEqualAtomicSib
					}
				}
			}
			
			Unnamed1PutToContextSib case sib10_unnamed1PutToContextSib: {
				switch branch : sib.execute(false) {
					SuccessUnnamed1PutToContextBranch: {
						branch39_successUnnamed1PutToContextBranch = branch
						var1_igG = branch39_successUnnamed1PutToContextBranch?.reset
						if (sib5_myPackagegetAttributesAtomicSib === null) {
							sib5_myPackagegetAttributesAtomicSib = new MyPackagegetAttributesAtomicSib
						}
						return sib5_myPackagegetAttributesAtomicSib
					}
				}
			}
			
			Unnamed2PutToContextSib case sib11_unnamed2PutToContextSib: {
				switch branch : sib.execute(true) {
					SuccessUnnamed2PutToContextBranch: {
						branch40_successUnnamed2PutToContextBranch = branch
						var1_igG = branch40_successUnnamed2PutToContextBranch?.igGFlag
						if (sib8_commonRealSibGreaterOrEqualAtomicSib === null) {
							sib8_commonRealSibGreaterOrEqualAtomicSib = new CommonRealSibGreaterOrEqualAtomicSib
						}
						return sib8_commonRealSibGreaterOrEqualAtomicSib
					}
				}
			}
			
			CommonRealSibGreaterOrEqualAtomicSib case sib12_commonRealSibGreaterOrEqualAtomicSib: {
				switch branch : sib.execute(branch31_successMyPackagegetAttributesAtomicBranch?.slfc, 1.65) {
					SuccessCommonRealSibGreaterOrEqualAtomicBranch: {
						branch41_successCommonRealSibGreaterOrEqualAtomicBranch = branch
						if (sib15_commonBooleanSibIfAtomicSib === null) {
							sib15_commonBooleanSibIfAtomicSib = new CommonBooleanSibIfAtomicSib
						}
						return sib15_commonBooleanSibIfAtomicSib
					}
				}
			}
			
			CommonRealSibLessOrEqualAtomicSib case sib13_commonRealSibLessOrEqualAtomicSib: {
				switch branch : sib.execute(branch31_successMyPackagegetAttributesAtomicBranch?.slfc, 0.26) {
					SuccessCommonRealSibLessOrEqualAtomicBranch: {
						branch42_successCommonRealSibLessOrEqualAtomicBranch = branch
						if (sib14_commonBooleanSibIfAtomicSib === null) {
							sib14_commonBooleanSibIfAtomicSib = new CommonBooleanSibIfAtomicSib
						}
						return sib14_commonBooleanSibIfAtomicSib
					}
				}
			}
			
			CommonBooleanSibIfAtomicSib case sib14_commonBooleanSibIfAtomicSib: {
				switch branch : sib.execute(branch42_successCommonRealSibLessOrEqualAtomicBranch?.result) {
					TrueCommonBooleanSibIfAtomicBranch: {
						branch43_trueCommonBooleanSibIfAtomicBranch = branch
						if (sib19_commonRealSibGreaterOrEqualAtomicSib === null) {
							sib19_commonRealSibGreaterOrEqualAtomicSib = new CommonRealSibGreaterOrEqualAtomicSib
						}
						return sib19_commonRealSibGreaterOrEqualAtomicSib
					}
					FalseCommonBooleanSibIfAtomicBranch: {
						branch44_falseCommonBooleanSibIfAtomicBranch = branch
						if (sib12_commonRealSibGreaterOrEqualAtomicSib === null) {
							sib12_commonRealSibGreaterOrEqualAtomicSib = new CommonRealSibGreaterOrEqualAtomicSib
						}
						return sib12_commonRealSibGreaterOrEqualAtomicSib
					}
				}
			}
			
			CommonBooleanSibIfAtomicSib case sib15_commonBooleanSibIfAtomicSib: {
				switch branch : sib.execute(branch41_successCommonRealSibGreaterOrEqualAtomicBranch?.result) {
					TrueCommonBooleanSibIfAtomicBranch: {
						branch45_trueCommonBooleanSibIfAtomicBranch = branch
						if (sib19_commonRealSibGreaterOrEqualAtomicSib === null) {
							sib19_commonRealSibGreaterOrEqualAtomicSib = new CommonRealSibGreaterOrEqualAtomicSib
						}
						return sib19_commonRealSibGreaterOrEqualAtomicSib
					}
					FalseCommonBooleanSibIfAtomicBranch: {
						branch46_falseCommonBooleanSibIfAtomicBranch = branch
						if (sib16_commonBooleanSibIfAtomicSib === null) {
							sib16_commonBooleanSibIfAtomicSib = new CommonBooleanSibIfAtomicSib
						}
						return sib16_commonBooleanSibIfAtomicSib
					}
				}
			}
			
			CommonBooleanSibIfAtomicSib case sib16_commonBooleanSibIfAtomicSib: {
				switch branch : sib.execute(var1_igG) {
					TrueCommonBooleanSibIfAtomicBranch: {
						branch47_trueCommonBooleanSibIfAtomicBranch = branch
						if (sib17_unnamed3PutToContextSib === null) {
							sib17_unnamed3PutToContextSib = new Unnamed3PutToContextSib
						}
						return sib17_unnamed3PutToContextSib
					}
					FalseCommonBooleanSibIfAtomicBranch: {
						branch48_falseCommonBooleanSibIfAtomicBranch = branch
						if (sib18_unnamed4PutToContextSib === null) {
							sib18_unnamed4PutToContextSib = new Unnamed4PutToContextSib
						}
						return sib18_unnamed4PutToContextSib
					}
				}
			}
			
			Unnamed3PutToContextSib case sib17_unnamed3PutToContextSib: {
				switch branch : sib.execute('IgG Monitor annually via GP') {
					SuccessUnnamed3PutToContextBranch: {
						branch49_successUnnamed3PutToContextBranch = branch
						var2_outcome = branch49_successUnnamed3PutToContextBranch?.input2
						if (sib25_myPackagesetResultAtomicSib === null) {
							sib25_myPackagesetResultAtomicSib = new MyPackagesetResultAtomicSib
						}
						return sib25_myPackagesetResultAtomicSib
					}
				}
			}
			
			Unnamed4PutToContextSib case sib18_unnamed4PutToContextSib: {
				switch branch : sib.execute('IgA Monitor 6 months via GP') {
					SuccessUnnamed4PutToContextBranch: {
						branch50_successUnnamed4PutToContextBranch = branch
						var2_outcome = branch50_successUnnamed4PutToContextBranch?.input2
						if (sib25_myPackagesetResultAtomicSib === null) {
							sib25_myPackagesetResultAtomicSib = new MyPackagesetResultAtomicSib
						}
						return sib25_myPackagesetResultAtomicSib
					}
				}
			}
			
			CommonRealSibGreaterOrEqualAtomicSib case sib19_commonRealSibGreaterOrEqualAtomicSib: {
				switch branch : sib.execute(branch31_successMyPackagegetAttributesAtomicBranch?.value, 30.0) {
					SuccessCommonRealSibGreaterOrEqualAtomicBranch: {
						branch51_successCommonRealSibGreaterOrEqualAtomicBranch = branch
						if (sib20_commonBooleanSibIfAtomicSib === null) {
							sib20_commonBooleanSibIfAtomicSib = new CommonBooleanSibIfAtomicSib
						}
						return sib20_commonBooleanSibIfAtomicSib
					}
				}
			}
			
			CommonBooleanSibIfAtomicSib case sib20_commonBooleanSibIfAtomicSib: {
				switch branch : sib.execute(branch51_successCommonRealSibGreaterOrEqualAtomicBranch?.result) {
					TrueCommonBooleanSibIfAtomicBranch: {
						branch52_trueCommonBooleanSibIfAtomicBranch = branch
						if (sib24_unnamed6PutToContextSib === null) {
							sib24_unnamed6PutToContextSib = new Unnamed6PutToContextSib
						}
						return sib24_unnamed6PutToContextSib
					}
					FalseCommonBooleanSibIfAtomicBranch: {
						branch53_falseCommonBooleanSibIfAtomicBranch = branch
						if (sib21_commonRealSibGreaterOrEqualAtomicSib === null) {
							sib21_commonRealSibGreaterOrEqualAtomicSib = new CommonRealSibGreaterOrEqualAtomicSib
						}
						return sib21_commonRealSibGreaterOrEqualAtomicSib
					}
				}
			}
			
			CommonRealSibGreaterOrEqualAtomicSib case sib21_commonRealSibGreaterOrEqualAtomicSib: {
				switch branch : sib.execute(branch31_successMyPackagegetAttributesAtomicBranch?.slfc, 100.0) {
					SuccessCommonRealSibGreaterOrEqualAtomicBranch: {
						branch54_successCommonRealSibGreaterOrEqualAtomicBranch = branch
						if (sib22_commonBooleanSibIfAtomicSib === null) {
							sib22_commonBooleanSibIfAtomicSib = new CommonBooleanSibIfAtomicSib
						}
						return sib22_commonBooleanSibIfAtomicSib
					}
				}
			}
			
			CommonBooleanSibIfAtomicSib case sib22_commonBooleanSibIfAtomicSib: {
				switch branch : sib.execute(branch54_successCommonRealSibGreaterOrEqualAtomicBranch?.result) {
					TrueCommonBooleanSibIfAtomicBranch: {
						branch55_trueCommonBooleanSibIfAtomicBranch = branch
						if (sib24_unnamed6PutToContextSib === null) {
							sib24_unnamed6PutToContextSib = new Unnamed6PutToContextSib
						}
						return sib24_unnamed6PutToContextSib
					}
					FalseCommonBooleanSibIfAtomicBranch: {
						branch56_falseCommonBooleanSibIfAtomicBranch = branch
						if (sib23_unnamed5PutToContextSib === null) {
							sib23_unnamed5PutToContextSib = new Unnamed5PutToContextSib
						}
						return sib23_unnamed5PutToContextSib
					}
				}
			}
			
			Unnamed5PutToContextSib case sib23_unnamed5PutToContextSib: {
				switch branch : sib.execute('Refer To Haematology') {
					SuccessUnnamed5PutToContextBranch: {
						branch57_successUnnamed5PutToContextBranch = branch
						var2_outcome = branch57_successUnnamed5PutToContextBranch?.input2
						if (sib25_myPackagesetResultAtomicSib === null) {
							sib25_myPackagesetResultAtomicSib = new MyPackagesetResultAtomicSib
						}
						return sib25_myPackagesetResultAtomicSib
					}
				}
			}
			
			Unnamed6PutToContextSib case sib24_unnamed6PutToContextSib: {
				switch branch : sib.execute('Urgent Haematology Referral') {
					SuccessUnnamed6PutToContextBranch: {
						branch58_successUnnamed6PutToContextBranch = branch
						var2_outcome = branch58_successUnnamed6PutToContextBranch?.input2
						if (sib25_myPackagesetResultAtomicSib === null) {
							sib25_myPackagesetResultAtomicSib = new MyPackagesetResultAtomicSib
						}
						return sib25_myPackagesetResultAtomicSib
					}
				}
			}
			
			MyPackagesetResultAtomicSib case sib25_myPackagesetResultAtomicSib: {
				switch branch : sib.execute(var0_variable, var2_outcome) {
					SuccessMyPackagesetResultAtomicBranch: {
						branch59_successMyPackagesetResultAtomicBranch = branch
						if (sib26_myPackageResultToStringAtomicSib === null) {
							sib26_myPackageResultToStringAtomicSib = new MyPackageResultToStringAtomicSib
						}
						return sib26_myPackageResultToStringAtomicSib
					}
				}
			}
			
			MyPackageResultToStringAtomicSib case sib26_myPackageResultToStringAtomicSib: {
				switch branch : sib.execute(branch29_nextUnnamed0IterateBranch?.element) {
					SuccessMyPackageResultToStringAtomicBranch: {
						branch60_successMyPackageResultToStringAtomicBranch = branch
						if (sib27_commonTextSibPrintAtomicSib === null) {
							sib27_commonTextSibPrintAtomicSib = new CommonTextSibPrintAtomicSib
						}
						return sib27_commonTextSibPrintAtomicSib
					}
				}
			}
			
			CommonTextSibPrintAtomicSib case sib27_commonTextSibPrintAtomicSib: {
				switch branch : sib.execute(branch60_successMyPackageResultToStringAtomicBranch?.result) {
					SuccessCommonTextSibPrintAtomicBranch: {
						branch61_successCommonTextSibPrintAtomicBranch = branch
						if (sib4_unnamed0IterateSib === null) {
							sib4_unnamed0IterateSib = new Unnamed0IterateSib
						}
						return sib4_unnamed0IterateSib
					}
				}
			}
			
		}
		
	}
	
}
