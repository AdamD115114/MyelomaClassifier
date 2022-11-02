// Generated by info.scce.cinco.product.minidime.generator.common.BooleanExtensionGenerator
	
package common

class BooleanExtension {
	
	def static void print(Boolean b) {
		println(b)
	}
	
	def static Long toLong(Boolean b) {
		if (b === null) return null
		if (b) 1L else 0L
	}
	
	def static Double toDouble(Boolean b) {
		if (b === null) return null
		if (b) 1D else 0D
	}
	
	def static String toString(Boolean b) {
		b?.toString
	}
	
	def static Boolean not(Boolean b) {
		!b
	}
	
	def static Boolean equal(Boolean b1, Boolean b2) {
		b1 == b2
	}
	
	def static Boolean notEqual(Boolean b1, Boolean b2) {
		b1 != b2
	}
	
	def static Boolean and(Boolean b1, Boolean b2) {
		b1 && b2
	}
	
	def static Boolean or(Boolean b1, Boolean b2) {
		b1 || b2
	}
	
	def static Boolean ifSwitch(Boolean b) {
		b
	}
	
}
