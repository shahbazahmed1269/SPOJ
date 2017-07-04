package kotlincode

import java.util.Scanner
import java.util.Arrays;

/**
 * Solution to SPOJ problem STAMPS
 * @see <a href="http://www.spoj.com/problems/STAMPS/">http://www.spoj.com/problems/STAMPS/</a>
 * @author Shahbaz Ahmed
 *
 */ 
fun main(a: Array<String>) {
	val sc = Scanner(System.`in`)
	var n = sc.nextInt()
	var nCopy = n
	while (n-- > 0) {
		var total = sc.nextInt()
		var noStamps = 0
		var stampsCollected = 0
		var noOfFriends = sc.nextInt()
		var a = IntArray(noOfFriends+1)
		for (i in 0..noOfFriends-1) {
			a[i] = sc.nextInt()
		}
		a.sortDescending()
		for ((i, no) in a.withIndex()) {
			if (stampsCollected >= total) {
				break
			} else {
				stampsCollected += a[i]
				noStamps++
			}
		}
		println("Scenario #${nCopy-n}:")
		if (stampsCollected >= total) {
			println("$noStamps")
		} else {
			println("impossible")
		}
		println()
	}
	sc.close()
}