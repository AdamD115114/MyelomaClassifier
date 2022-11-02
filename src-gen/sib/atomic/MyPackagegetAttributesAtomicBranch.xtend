// Generated by info.scce.cinco.product.minidime.generator.sib.atomic.AtomicBranchGenerator
	
package sib.atomic

import org.eclipse.xtend.lib.annotations.Data
import tuple.Tuple5

abstract class MyPackagegetAttributesAtomicBranch extends AtomicBranch {
	// Intentionally left blank
}

@Data
class SuccessMyPackagegetAttributesAtomicBranch extends MyPackagegetAttributesAtomicBranch {
	
	// Variables
	val String iprn
	val Double slfc
	val String pprot
	val Double value
	val String result
	
	// Constructors
	new(String iprn, Double slfc, String pprot, Double value, String result) {
		this.iprn = iprn
		this.slfc = slfc
		this.pprot = pprot
		this.value = value
		this.result = result
	}
	
	new(Tuple5<String, Double, String, Double, String> tuple) {
		this.iprn = tuple.element0
		this.slfc = tuple.element1
		this.pprot = tuple.element2
		this.value = tuple.element3
		this.result = tuple.element4
	}
	
}