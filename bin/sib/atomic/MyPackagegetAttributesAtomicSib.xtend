// Generated by info.scce.cinco.product.minidime.generator.sib.atomic.AtomicSibGenerator
	
package sib.atomic

import myPackage.Result
import myPackage.getData

class MyPackagegetAttributesAtomicSib extends AtomicSib {
	
	// Execute method
	def MyPackagegetAttributesAtomicBranch execute(Result input) {
		val result = getData.getAttributes(input)
		return new SuccessMyPackagegetAttributesAtomicBranch(
			result.get(0) as String,
			result.get(1) as Double,
			result.get(2) as String,
			result.get(3) as Double,
			result.get(4) as String
		)
	}
	
}
