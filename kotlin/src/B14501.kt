import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max

class B14501 {
    fun solution() : Int{
        val br = BufferedReader(InputStreamReader(System.`in`))
        val n = br.readLine().toInt()
        val dp = Array(17){ 0 }
        var m = 0

        for(i in 1..n){
            val st = StringTokenizer(br.readLine())
            val t = st.nextToken().toInt()
            val p = st.nextToken().toInt()
            m = max(m, dp[i])

            if(i+t <= n+1) {
                dp[i+t] = max(dp[i+t], m+p)
            } else {
                continue
            }
        }
        return dp.max()
    }
}

fun main() {
    val b = B14501()
    println(b.solution())
}