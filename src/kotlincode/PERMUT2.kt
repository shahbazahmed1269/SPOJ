package kotlincode

import java.util.StringTokenizer
import java.util.HashMap

fun main(a: Array<String>) {
	var n = readLine().toString().toInt()
	while (n > 0) {
		var hm = HashMap<Int, Int>()
		var arr = IntArray(n+1)
		val st = StringTokenizer(readLine().toString())
        for (i in 1..n) {
			val x = st.nextToken().toInt()
            hm.put(x, i)
			arr[i] = x
		}
		var isAmbiguous = true
		for (i in 1..n) {
			if (hm.get(i) != arr[i]) {
				isAmbiguous = false
				break
			}
		}
		if (isAmbiguous) println("ambiguous") else println("not ambiguous")
		n = readLine().toString().toInt()
	}
}