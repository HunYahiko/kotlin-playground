package nullsafety

class Wolf {
    var hunger = 10
    var food = "meat"

    fun eat() = println("The Wolf is eating $food")
}

class MyWolf {
    var wolf: Wolf? = Wolf()

    fun myFunction() = wolf?.eat()
}

fun getAlphaWolf() : Wolf? = Wolf()