

fun main(args: Array<String>) {
    //insira as variaveis corretamente
    var r = 0
    for (i in 0..readLine()!!.toInt()) {

        if(r > 0){
            println("$i  ${ i * i } ${ i* i * i }")
        }
        r += 1
    }
}