import java.io.BufferedReader
import java.io.InputStreamReader

class B17451 {
    fun solution(): Long {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val n = br.readLine().toInt()
        val dis = br.readLine().split(" ").map { it.toLong() }.toLongArray()

        var result = 0L
        for(d in dis.reversed()){
            result =
                if(d < result) {
                    val c = if(result % d == 0L) result/d else (result/d)+1
                    d * c
            } else d
        }

        return result
    }
}

fun main() {
    val b = B17451()
    println(b.solution())
}