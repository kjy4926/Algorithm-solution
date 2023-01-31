import java.io.BufferedReader
import java.io.InputStreamReader

class B17478 {
    val q = "\"재귀함수가 뭔가요?\""
    val l1 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어."
    val l2 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지."
    val l3 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\""
    val a2 = "\"재귀함수는 자기 자신을 호출하는 함수라네\""
    val end = "라고 답변하였지."

    init {
        println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.")
    }

    fun recursive(n: Int, depth: Int) {
        val underbar = "____".repeat(depth)
        println(underbar + q)
        if(n == 0) {
            println(underbar + a2)
        } else {
            println(underbar + l1)
            println(underbar + l2)
            println(underbar + l3)
            recursive(n-1, depth+1)
        }
        println(underbar + end)
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val b = B17478()
    b.recursive(n, 0)
}