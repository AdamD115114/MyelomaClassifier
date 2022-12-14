// Generated by info.scce.cinco.product.minidime.generator.common.LongExtensionGenerator
	
package common

class LongExtension {
	
	def static void print(Long l) {
		println(l)
	}
	
	def static Double toDouble(Long l) {
		if (l === null) return null
		l.doubleValue
	}
	
	def static Boolean toBoolean(Long l) {
		if (l === null) return null
		l != 0
	}
	
	def static String toString(Long l) {
		l?.toString
	}
	
	def static Boolean equal(Long l1, Long l2) {
		l1 == l2
	}
	
	def static Boolean notEqual(Long l1, Long l2) {
		l1 != l2
	}
	
	def static Boolean less(Long l1, Long l2) {
		l1 < l2
	}
	
	def static Boolean lessOrEqual(Long l1, Long l2) {
		l1 <= l2
	}
	
	def static Boolean greater(Long l1, Long l2) {
		l1 > l2
	}
	
	def static Boolean greaterOrEqual(Long l1, Long l2) {
		l1 >= l2
	}
	
	def static Long add(Long l1, Long l2) {
		l1 + l2
	}
	
	def static Long subtract(Long l1, Long l2) {
		l1 - l2
	}
	
	def static Long multiply(Long l1, Long l2) {
		l1 * l2
	}
	
	def static Long divide(Long l1, Long l2) {
		l1 / l2
	}
	
}
