package kotlincode

/**
 * Solution to SPOJ problem AGGRCOW
 * @see <a href="https://www.spoj.com/problems/AGGRCOW/">https://www.spoj.com/problems/AGGRCOW/</a>
 * @author Shahbaz Ahmed
 *
 */
fun main(a: Array<String>) {
	var t = readLine().toString().toInt()
	while (t-- > 0) {
		val (n, c) = readLine()!!.split(' ').map(String::toInt)
		var slots = LongArray(n)
		for (i in 0..n-1) {
			slots[i] = readLine().toString().toLong()
		}
		slots.sort()
		
		var low = 0L
		var high = slots[n-1] - slots[0] + 1
		var res = 0L
		
		while (low <= high) {
			var mid = low + (high-low) / 2
			if (canPlaceWithMinDistance(mid, slots, c)) {
				res = mid
				low = mid + 1
			} else {
				high = mid - 1
			}
		}
		println(res)
	}
}

fun canPlaceWithMinDistance(minDistance: Long, slots: LongArray, numCows: Int): Boolean {
	//Place first cow in the the first slot
	var lastPlacedAt = slots[0]
	var count = 1
	for (i in 1..slots.size-1) {
		if (slots[i] - lastPlacedAt >= minDistance) {
			lastPlacedAt = slots[i]
			count++
			if (count == numCows) {
				return true
			}
		}
	}
	return false
}