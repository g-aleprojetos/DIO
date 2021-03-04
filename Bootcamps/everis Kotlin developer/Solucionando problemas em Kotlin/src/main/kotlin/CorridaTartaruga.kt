import java.io.EOFException

fun main(args: Array<String>) {

    while (true) {

        try {

            val l = readLine()!!.toInt()
            val v = readLine()!!.split(" ").run { map { it.toInt() } }
            val s = v.toTypedArray()
            s.sort()

            when (s.last()) {

                in 0 .. 9 -> {
                    println(1)
                }
                in 10 .. 19 -> {
                    println(2)
                }
                else -> {
                    println(3)
                }

            }

        } catch (f : Exception ) {
            break
        } catch (n : Exception) {
            break
        } catch (e : Exception) {
            break
        }
    }
}