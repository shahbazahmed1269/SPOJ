package kotlincode

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(a: Array<String>) {
	var br = BufferedReader(InputStreamReader(System.`in`))
    var t = br.readLine().toInt()
    while (t-- > 0) {
        var n = br.readLine().toLong()
		println(n*(n+2)*(2*n+1)/8)
	}
}
