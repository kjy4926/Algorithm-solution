import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

class B3613 {
    fun solution() : String {

        val result = StringBuilder()
        val br = BufferedReader(InputStreamReader(System.`in`))
        val s = br.readLine()
        val ss = s.split("_")

        return when {
            // not java and not c++
            s.isEmpty() || s[0].isUpperCase() -> "Error!"
            // c++ case
            ss.size>1 -> {
                for(word in ss){
                    when {
                        word != word.lowercase() || word.isEmpty() -> {
                            result.clear()
                            result.append("Error!")
                            break
                        }
                        else -> {
                            when{
                                result.isEmpty() -> result.append(word)
                                else -> result.append(word[0].uppercase() + word.substring(1))
                            }
                        }
                    }
                }
                result.toString()
            }
            // java case
            else -> {
                for(c in s){
                    when {
                        c.isUpperCase() -> result.append("_" + c.lowercase())
                        else -> result.append(c)
                    }
                }
                result.toString()
            }
        }
    }
}

fun main(){
    val b = B3613()
    println(b.solution())
}