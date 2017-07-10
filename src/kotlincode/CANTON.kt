package kotlincode

/**
 * Solution to SPOJ problem CANTON
 * @see <a href="http://www.spoj.com/problems/CANTON/">http://www.spoj.com/problems/CANTON/</a>
 * @author Shahbaz Ahmed
 *
 */ 
fun main(args: Array<String>) {
    var n = readLine().toString().toInt()
    while (n-- > 0) {
        var term = readLine().toString().toInt()
        var sum = 0
        var i = 0
        while(sum < term) {
            i++
            sum += i
        }
        if (i % 2 ==0) {
            println("TERM $term IS ${i-(sum-term)}/${1+(sum-term)}")
        } else {
            println("TERM $term IS ${1+(sum-term)}/${i-(sum-term)}")
        }
    }
}