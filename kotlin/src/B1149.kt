import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

// DP solution
class B1149 {
    fun solution() : Int {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val n = br.readLine().toInt()

        val arr = Array(1001){
            (Array(3){ Integer.MAX_VALUE })
        }

        val first = br.readLine().split(" ")
        arr[1][0] = first[0].toInt()
        arr[1][1] = first[1].toInt()
        arr[1][2] = first[2].toInt()

        for(i in 2..n){
            val line = br.readLine().split(" ")
            val nums = Array<Int>(3){
                j -> line[j].toInt()
            }
            arr[i] = nums.clone()

            arr[i][0] = min(arr[i-1][1], arr[i-1][2]) + arr[i][0]
            arr[i][1] = min(arr[i-1][0], arr[i-1][2]) + arr[i][1]
            arr[i][2] = min(arr[i-1][0], arr[i-1][1]) + arr[i][2]
            //println(nums.contentToString())
        }
        return arr[n].min()
    }
}
fun main(){
    val b = B1149()
    print(b.solution())
}