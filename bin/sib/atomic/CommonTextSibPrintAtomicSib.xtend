// Generated by info.scce.cinco.product.minidime.generator.sib.atomic.AtomicSibGenerator
	
package sib.atomic

import common.StringExtension

class CommonTextSibPrintAtomicSib extends AtomicSib {
	
	// Execute method
	def CommonTextSibPrintAtomicBranch execute(String input) {
		StringExtension.print(input)
		return new SuccessCommonTextSibPrintAtomicBranch
	}
	
}