package kotlincode

import java.util.*

fun main(a: Array<String>) {
    var sc = Scanner(System.`in`)
    var n = sc.nextInt()
    while (n-- > 0) {
        var ng = sc.nextInt()
        var nm = sc.nextInt()
        var ngMax = 0
        var nmMax = 0
        for (i in 0..ng-1) {
            var x = sc.nextInt()
            if (ngMax < x) {
                ngMax = x
            }
        }
        for (i in 0..nm-1) {
            var x = sc.nextInt()
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