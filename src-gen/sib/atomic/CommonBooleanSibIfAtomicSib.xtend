// Generated by info.scce.cinco.product.minidime.generator.sib.atomic.AtomicSibGenerator
	
package sib.atomic

import common.BooleanExtension

class CommonBooleanSibIfAtomicSib extends AtomicSib {
	
	// Execute method
	def CommonBooleanSibIfAtomicBranch execute(Boolean input) {
		val result = BooleanExtension.ifSwitch(input)
		if (result) {
			return new TrueCommonBooleanSibIfAtomicBranch
		}
		else {
			return new FalseCommonBooleanSibIfAtomicBranch
		}
	}
	
}