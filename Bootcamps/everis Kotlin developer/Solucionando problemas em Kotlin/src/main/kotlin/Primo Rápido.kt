
fun main(args: Array<String>) {
    //continue a solução
    val n = readLine()!!.toInt()
    var num: Int


    for(i in 1..n) {
        num = readLine()!!.toInt()
        val t = kotlin.math.sqrt(num.toDouble()).toInt() + 1
        var qtdDivisores = true

        for (i in 2..t) {
            if ((num % i) == 0) {
                qtdDivisores = false
            }
        }

        if (num == 1 || num == 2 || qtdDivisores) {
            println("Prime")

        } else {
            println("Not Prime")

        }

    }

}