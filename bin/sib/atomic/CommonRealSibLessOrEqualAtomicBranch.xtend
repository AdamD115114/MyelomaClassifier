// Generated by info.scce.cinco.product.minidime.generator.sib.atomic.AtomicBranchGenerator
	
package sib.atomic

import org.eclipse.xtend.lib.annotations.Data
import tuple.Tuple1

abstract class CommonRealSibLessOrEqualAtomicBranch extends AtomicBranch {
	// Intentionally left blank
}

@Data
class SuccessCommonRealSibLessOrEqualAtomicBranch extends CommonRealSibLessOrEqualAtomicBranch {
	
	// Variables
	val Boolean result
	
	// Constructors
	new(Boolean result) {
		this.result = result
	}
	
	new(Tuple1<Boolean> tuple) {
		this.result = tuple.element0
	}
	
}
