package dataclasses

fun main() {
    val chickenCurry = Recipe("Chicken Curry", "Chicken")
    val anotherChickenCurry = Recipe("Chicken Curry", "Chicken")
    val chickenCurryCopy = chickenCurry.copy(title = "Chicken Curry but copied")
    println("chickenCurry hasCode: ${chickenCurry.hashCode()}")
    println("anotherChickenCurry hasCode: ${anotherChickenCurry.hashCode()}")
    println("chickenCurryCopy hasCode: ${chickenCurryCopy.hashCode()}")
    println("chickenCurry toString: $chickenCurry")
    println("chickenCurry == anotherChickenCurry? ${chickenCurry == anotherChickenCurry}")
    println("chickenCurry === anotherChickenCurry? ${chickenCurry === anotherChickenCurry}")
    println("chickenCurry == chickenCurryCopy? ${chickenCurry == chickenCurryCopy}")
    val (title, mainIngredient, vegetarian, difficulty) = chickenCurry
    println("title is $title and main ingredient is $mainIngredient and vegetarian is $vegetarian and difficulty is $difficulty")

    val mushroom = Mushroom(6, false)
    val anotherMushroom = Mushroom(true)
    println("mushroom has size ${mushroom.size} and ${if (mushroom.isMagic) "magic" else "not magic"}")
    println("another mushroom has size ${anotherMushroom.size} and ${if (anotherMushroom.isMagic) "magic" else "not magic"}")

    println(addNumbers(2, 6))
    println(addNumbers(1.45, 2.77))
}