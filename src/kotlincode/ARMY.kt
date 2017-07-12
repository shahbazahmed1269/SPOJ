package kotlincode

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
/**
 * Solution to SPOJ problem ARMY
 * @see <a href="http://www.spoj.com/problems/ARMY/">http://www.spoj.com/problems/ARMY/</a>
 * @author Shahbaz Ahmed
 *
 */ 
fun main(a: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var n = br.readLine().toInt()
    while (n-- > 0) {
        br.readLine()
        var st = StringTokenizer(br.readLine())
        val ng = st.nextToken().toInt()
        val nm = st.nextToken().toInt()
        var ngMax = 0
        var nmMax = 0
        st = StringTokenizer(br.readLine())
        for (i in 0..ng-1) {
            var x = st.nextToken().toInt()
            if (ngMax < x) {
                ngMax = x
            }
        }
        st = StringTokenizer(br.readLine())
        for (i in 0..nm-1) {
            var x = st.nextToken().toInt()
            if (nmMax < x) {
                nmMax = x
            }
        }
        if (ngMax < nmMax) {
            println("MechaGodzilla")
        } else {
            println("Godzilla")
        }
    }
}