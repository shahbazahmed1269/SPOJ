package kotlincode

import java.io.IOException
import java.util.Scanner

/**
 * Solution to SPOJ problem WILLITST
 * @see <a href="http://www.spoj.com/problems/WILLITST/">http://www.spoj.com/problems/WILLITST</a>
 * @author Shahbaz Ahmed
 *
 */
fun main(a: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    if ((n and n - 1) == 0L) {
        println("TAK")
    } else {
        println("NIE")
    }
    sc.close()
}

