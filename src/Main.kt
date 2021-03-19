import java.util.*
import kotlin.math.max

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val max = max(a, max(b, c))
    println(max)
}