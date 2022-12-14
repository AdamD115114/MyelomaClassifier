// Generated by info.scce.cinco.product.minidime.generator.common.ListExtensionGenerator
	
package common

import java.util.List
import tuple.Tuple2

class ListExtension {
	
	def static <T> void print(List<T> l) {
		println(l)
	}
	
	def static <T> Boolean equal(List<T> l1, List<T> l2) {
		l1 === l2 || l1.equals(l2)
	}
	
	def static <T> Boolean notEqual(List<T> l1, List<T> l2) {
		!l1.equal(l2)
	}
	
	def static <T> T getElement(List<T> l, Long i) {
		l.get(i.intValue)
	}
	
	def static <T> void setElement(List<T> l, Long i, T e) {
		l.set(i.intValue, e)
	}
	
	def static <T> void removeElement(List<T> l, T e) {
		l.remove(e)
	}
	
	def static <T> void insertAtIndex(List<T> l, Long i, T e) {
		l.add(i.intValue, e)
	}
	
	def static <T> T removeAtIndex(List<T> l, Long i) {
		l.remove(i.intValue)
	}
	
	def static <T> Tuple2<T, List<T>> splitFirst(List<T> l) {
		new Tuple2(l.head, l.tail)
	}
	
	def static <T> Tuple2<List<T>, T> splitLast(List<T> l) {
		new Tuple2(l.reverse.tail.toList.reverse, l.last)
	}
	
	def static <T> List<T> prepend(List<T> l, T e) {
		(#[e] + l).toList
	}
	
	def static <T> List<T> append(List<T> l, T e) {
		(l + #[e]).toList
	}
	
	def static <T> List<T> reverseOrder(List<T> l) {
		l.reverse
	}
	
}
