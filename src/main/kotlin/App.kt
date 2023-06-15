fun main() {
    var x = 1
    println("Before the loop, x = $x.")
    while (x < 4) {
        println("In the loop, x = $x.")
        x += 1
    }
    println("After the loop, x = $x.")

    val z = 4
    val y = 5
    val statement = if (z < y) "z is smaller than y" else "z is not smaller than y" // if can be used to return values


}