package inheritance

fun main() {
    val animals = arrayOf(Wolf(), Hippo())
    val vet = Vet()

    for (animal in animals) {
        animal.eat()
        animal.roam()
        vet.giveShot(animal)
    }

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())

    for (roamable in roamables) {
        roamable.roam()
        if (roamable is Animal)
            roamable.eat()
    }

}