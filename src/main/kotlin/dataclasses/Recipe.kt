package dataclasses

data class Recipe(val title: String,
                  val mainIngredient: String,
                  val isVegetarian: Boolean = false,
                  val difficulty: String = "Easy")

class Mushroom(val size: Int, val isMagic: Boolean) {
    constructor(magicParam: Boolean) : this(0, magicParam)
}

fun findRecipe(title: String = "",
               ingredient: String = "",
               isVegetarian: Boolean = false,
               difficulty: String = "") : Array<Recipe> {
    return arrayOf(Recipe(title, ingredient, isVegetarian, difficulty))
}

fun addNumbers(a: Int, b: Int): Int = a + b

fun addNumbers(a: Double, b: Double): Double = a + b