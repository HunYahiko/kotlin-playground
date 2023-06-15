package generics

fun interface Retailer<out T> {
    fun sell(): T
}