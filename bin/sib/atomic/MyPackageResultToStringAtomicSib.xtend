// Generated by info.scce.cinco.product.minidime.generator.sib.atomic.AtomicSibGenerator
	
package sib.atomic

import myPackage.Result
import myPackage.getData

class MyPackageResultToStringAtomicSib extends AtomicSib {
	
	// Execute method
	def MyPackageResultToStringAtomicBranch execute(Result input) {
		val result = getData.toString(input)
		return new SuccessMyPackageResultToStringAtomicBranch(result)
	}
	
}
