import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

class B16960 {
    fun solution() : Int {
        val br = BufferedReader(InputStreamReader(System.`in`))
        var st = StringTokenizer(br.readLine())
        val n = st.nextToken().toInt()
        val m = st.nextToken().toInt()
        val switch = HashMap<Int, MutableList<Int>>() // 스위치
        val lamp = Array(m+1){ 0 } // 램프


        for(i in 1..n) {
            switch[i] = mutableListOf()
        }

        for(i in 1..n) {
            st = StringTokenizer(br.readLine())
            val k = st.nextToken().toInt()
            while(st.hasMoreTokens()){
                val v = st.nextToken().toInt()
                switch[i]!!.add(v)
                lamp[v]++
            }
        }

        for(key in switch.keys){
            var flag = 1
            for(i in switch[key]!!){
                if(lamp[i]-1 == 0){
                    flag = 0
                    break
                }
            }
            if(flag == 1) return 1
        }
        return 0
    }
}

fun main() {
    val b = B16960()
    println(b.solution())
}