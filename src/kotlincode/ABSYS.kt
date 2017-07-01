package kotlincode

/**
 * Solution to SPOJ problem ABSYS
 * @see <a href="http://www.spoj.com/problems/ABSYS/">http://www.spoj.com/problems/ABSYS/</a>
 * @author Shahbaz Ahmed
 *
 */
fun main(a: Array<String>) {
	    var xPos: Int = 0
	    var n = readLine().toString().toInt()
	
	    while (n-- > 0) {
	    	readLine()	// Ignore empty lines in between test cases
	        var rawOpList = readLine().toString().trim().replace(" ", "").split(Regex("[=|+]"))
	        for ((i, op) in rawOpList.withIndex()) {
	            if (op.contains("machula", ignoreCase = true)) {
	                xPos = i
	            }
	        }
	        when (xPos) {
	            0 -> {
	                val resOp = rawOpList[2].toInt() - rawOpList[1].toInt()
	                println("$resOp + ${rawOpList[1]} = ${rawOpList[2]}")
	            }
	            1 -> {
	                val resOp = rawOpList[2].toInt() - rawOpList[0].toInt()
	                println("${rawOpList[0]} + $resOp = ${rawOpList[2]}")
	            }
	            2 -> {
	                val resOp = rawOpList[0].toInt() + rawOpList[1].toInt()
	                println("${rawOpList[0]} + ${rawOpList[1]} = $resOp")
	            }
	        }
	    }
	}