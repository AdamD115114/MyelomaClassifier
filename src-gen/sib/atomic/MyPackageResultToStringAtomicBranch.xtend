// Generated by info.scce.cinco.product.minidime.generator.sib.atomic.AtomicBranchGenerator
	
package sib.atomic

import org.eclipse.xtend.lib.annotations.Data
import tuple.Tuple1

abstract class MyPackageResultToStringAtomicBranch extends AtomicBranch {
	// Intentionally left blank
}

@Data
class SuccessMyPackageResultToStringAtomicBranch extends MyPackageResultToStringAtomicBranch {
	
	// Variables
	val String result
	
	// Constructors
	new(String result) {
		this.result = result
	}
	
	new(Tuple1<String> tuple) {
		this.result = tuple.element0
	}
	
}
